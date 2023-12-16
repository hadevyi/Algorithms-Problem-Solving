import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 조건 두 정수 비교
 *  - 링크 : https://www.codetree.ai/missions/4/problems/specific-comparison-of-two-natural-numbers/description
 * 2. 풀이핵심
 *  - 
 * 3. 풀이후기
 *  - 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d %d", a < b ? 1 : 0, a == b ? 1 : 0);
    }
}