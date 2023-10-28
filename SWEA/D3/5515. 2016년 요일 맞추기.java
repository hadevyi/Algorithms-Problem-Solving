import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5515. 2016년 요일 맞추기
 *  2. 풀이핵심
 *  - 나머지 연산자 활용하기
 * 3. 풀이후기
 *  - 시작 요일이 금요일이라 이 위치 값 조정이 필요했음
 */
public class Solution {

    public static int T;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{
       put(1, 31); put(2, 29); put(3, 31); put(4, 30); put(5, 31); put(6, 30);
       put(7, 31); put(8, 31); put(9, 30); put(10, 31); put(11, 30); put(12, 31);
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int MONTH = Integer.parseInt(st.nextToken());
            int DAY = Integer.parseInt(st.nextToken());

            for (int m = 1;m < MONTH;m++) {
                DAY += map.get(m);
            }

            DAY += 3;
            sb.append(DAY % 7);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}