import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 조건 배수의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-specific-condition-multiple/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int n = Math.min(a, b);n <= Math.max(a, b);n++) {
            if (n % 5 != 0) continue;
            result += n;
        }

        System.out.println(result);
    }
}
