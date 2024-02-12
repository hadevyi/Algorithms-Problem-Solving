import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 별표 출력하기 11
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-star-11/description
 * 2. 풀이핵심
 *  - 모양과 관계 없는 별 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) * 2;
        StringBuffer sb = new StringBuffer();
        String basic = "* * ", choose = "*   ";

        for (int n = 0;n < N + 1;n++) {
            for (int m = 0;m < N / 2;m++) {
                if (n % 2 == 0) sb.append(basic);
                else sb.append(choose);
            }
            sb.append("*\n");
        }

        System.out.println(sb.toString());
    }
}