import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2056. 연월일 달력
 *  2. 풀이핵심
 *  - Map으로 정보 관리하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T;
    public static Map<String, Integer> map = new HashMap<String, Integer>() {{
       put("01", 31); put("02", 28); put("03", 31); put("04", 30); put("05", 31); put("06", 30);
       put("07", 31); put("08", 31); put("09", 30); put("10", 31); put("11", 30); put("12", 31);
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            String YYMMDD = br.readLine(); // 0123 45 67
            String year = YYMMDD.substring(0, 4);
            String month = YYMMDD.substring(4, 6);
            String day = YYMMDD.substring(6, 8);

            boolean isValid = true;
            if (Integer.parseInt(month) < 1  || Integer.parseInt(month) > 12) isValid = false;

            if (isValid && !map.containsKey(month)) isValid = false;
            if (isValid && (Integer.parseInt(day) < 1 || Integer.parseInt(day) > map.get(month))) isValid = false;

            if (isValid) sb.append(year).append("/").append(month).append("/").append(day);
            else sb.append(-1);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
