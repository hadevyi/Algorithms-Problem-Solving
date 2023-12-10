import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 비교에 따른 연산
 *  - 링크 : https://www.codetree.ai/missions/4/problems/operation-based-on-comparison/description
 * 2. 풀이핵심
 *  - if-else 구문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) System.out.println(a * b);
        else System.out.println(b / a);
    }
}