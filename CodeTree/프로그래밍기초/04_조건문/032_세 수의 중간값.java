import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 세 수의 중간값
 *  - 링크 : https://www.codetree.ai/missions/4/problems/median-of-three-numbers/description
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

        System.out.println(b > a && b < c ? 1 : 0);
    }
}