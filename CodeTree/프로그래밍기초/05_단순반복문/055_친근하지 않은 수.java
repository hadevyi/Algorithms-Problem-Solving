import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 친근하지 않은 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/unfriendly-number/description
 * 2. 풀이핵심
 *  - continue 연습하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0;

        for (int n = 1;n <= N;n++) {
            if (n % 2 == 0) continue;
            if (n % 3 == 0) continue;
            if (n % 5 == 0) continue;
            count++;
        }

        System.out.println(count);
    }
}