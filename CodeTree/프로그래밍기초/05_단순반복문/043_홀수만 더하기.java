import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 홀수만 더하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/add-only-odd-numbers/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), result = 0;
        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 0) continue;
            if (num % 3 != 0) continue;
            result += num;
        }
        System.out.println(result);
    }
}