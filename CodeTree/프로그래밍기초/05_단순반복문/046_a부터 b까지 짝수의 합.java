import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : a부터 b까지 짝수의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-even-nums-from-a-to-b/description
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

        for (int n = a;n <= b;n++) {
            if (n % 2 != 0) continue;
            result += n;
        }

        System.out.println(result);
    }
}