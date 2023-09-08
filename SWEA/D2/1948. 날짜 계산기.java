import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1948. 날짜 계산기
 *  2. 풀이핵심
 *  - 사칙연산
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>() {{
       put(1, 31); put(2, 28); put(3, 31); put(4, 30); put(5, 31); put(6, 30);
       put(7, 31); put(8, 31); put(9, 30); put(10, 31); put(11, 30); put(12, 31);
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            Date date1 = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Date date2 = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            sb.append(date2.getDays() - date1.getDays() + 1);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Date {
        int month, day;
        public Date(int month, int day) {
            this.month = month;
            this.day = day;
        }
        public int getDays() {
            int result = day;

            for (int m = 1;m < this.month;m++)
                result += map.get(m);

            return result;
        }
    }
}
