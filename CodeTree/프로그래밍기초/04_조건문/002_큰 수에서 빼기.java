import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 큰 수에서 빼기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/subtract-from-large-number/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bigger = Integer.parseInt(st.nextToken());
        int small = Integer.parseInt(st.nextToken());

        if (bigger < small) {
            int temp = bigger;
            bigger = small;
            small = temp;
        }

        System.out.println(bigger - small);
    }
}