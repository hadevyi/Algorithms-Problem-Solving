import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 윤년 횟수 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-leap-years/description
 * 2. 풀이핵심
 *  - 조건 카운팅
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0;
        for (int n = 1;n <= N;n++) {
            if (n % 4 == 0) {
                if (n % 100 == 0 && n % 400 != 0) continue;
                count++;
            }
        }

        System.out.println(count);
    }
}