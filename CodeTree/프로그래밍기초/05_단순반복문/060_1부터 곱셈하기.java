import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1부터 곱셈하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiple-from-one/description
 * 2. 풀이핵심
 *  - break 구성하기
 * 3. 풀이후기
 *  - 간단한 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), mul = 1;

        for (int n = 1;n <= 10;n++) {
            mul *= n;
            if (mul >= N) {
                System.out.println(n);
                break;
            }
        }
    }
}