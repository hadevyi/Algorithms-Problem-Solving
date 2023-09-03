import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 13229. 일요일
 *  2. 풀이핵심
 *  - 간단한 분기 처리
 * 3. 풀이후기
 *  - if 대신 switch가 더 적절할 것같기도 하다.
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            String str = br.readLine();
            int day = 0;

            if (str.equals("SUN")) day = 7;
            else if (str.equals("MON")) day = 6;
            else if (str.equals("TUE")) day = 5;
            else if (str.equals("WED")) day = 4;
            else if (str.equals("THU")) day = 3;
            else if (str.equals("FRI")) day = 2;
            else if (str.equals("SAT")) day = 1;

            sb.append(day);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
