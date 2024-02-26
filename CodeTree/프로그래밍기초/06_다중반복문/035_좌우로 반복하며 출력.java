import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좌우로 반복하며 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-in-left-right-reverse/description
 * 2. 풀이핵심
 *  - 행, 열에 따라 다르게 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            int step = n % 2 == 0 ? 1 : -1;
            int num = n % 2 == 0 ? 1 : N;
            for (int m = 0;m < N;m++) {
                sb.append(num);
                num = num + step;
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}