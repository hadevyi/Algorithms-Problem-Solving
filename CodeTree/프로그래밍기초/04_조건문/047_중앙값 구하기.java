import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 중앙값 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-the-median/description
 * 2. 풀이핵심
 *  - 최소, 최대 구한 후 조건식
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));

        int result = 0;
        if (a != min && a != max) result = a;
        else if (b != min && b != max) result = b;
        else result = c;

        System.out.println(result);
    }
}