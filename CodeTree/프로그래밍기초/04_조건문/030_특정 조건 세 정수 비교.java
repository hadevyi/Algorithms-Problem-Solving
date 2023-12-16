import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 조건 세 정수 비교
 *  - 링크 : https://www.codetree.ai/missions/4/problems/specific-comparison-of-three-natural-numbers/description
 * 2. 풀이핵심
 *  - 복합 조건
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

        System.out.printf("%d %d", a == min ? 1 : 0, a == b && b == c ? 1 : 0);
    }
}