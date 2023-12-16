import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 장학금
 *  - 링크 : https://www.codetree.ai/missions/4/problems/scholarship/description
 * 2. 풀이핵심
 *  - 복합 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int mid = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int result = 0;

        if (mid >= 90) {
            if (end >= 95) result = 100000;
            else if (end >= 90) result = 50000;
        }

        System.out.println(result);
    }
}