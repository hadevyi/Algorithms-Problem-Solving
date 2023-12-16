import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4가지 관계연산자
 *  - 링크 : https://www.codetree.ai/missions/4/problems/four-relational-operators/description
 * 2. 풀이핵심
 *  - 삼항연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a >= b ? 1 : 0);
        System.out.println(a > b ? 1 : 0);
        System.out.println(a <= b ? 1 : 0);
        System.out.println(a < b ? 1 : 0);
    }
}