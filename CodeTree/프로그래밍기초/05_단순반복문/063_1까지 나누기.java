import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1까지 나누기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/divide-by-1/description
 * 2. 풀이핵심
 *  - break 구성하기
 * 3. 풀이후기
 *  - 간단한 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0;

        for (int n = 1;;n++) {
            if (N <= 1) break;
            N /= n;
            count++;
        }

        System.out.println(count);
    }
}