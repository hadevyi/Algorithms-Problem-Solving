import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : a의 b승
 *  - 링크 : https://www.codetree.ai/missions/4/problems/a-to-the-power-of-b/description
 * 2. 풀이핵심
 *  - 범위의 중첩 곱 구하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int result = 1;
        for (int n = 0;n < b;n++) result *= a;

        System.out.println(result);
    }
}