import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1940. 가랏! RC카!
 *  2. 풀이핵심
 *  - 간단한 사칙연산
 * 3. 풀이후기
 *  - 쉬운 문제 풀이
 */
public class Solution {

    public static int T, N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());

            int speed = 0, length = 0;

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int command = Integer.parseInt(st.nextToken());

                if (command == 1) { // 가속
                    speed += Integer.parseInt(st.nextToken());
                } else if (command == 2){ // 감속
                    speed -= Integer.parseInt(st.nextToken());
                    if (speed < 0) speed = 0;
                }

                length += speed;
            }

            sb.append(length);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
