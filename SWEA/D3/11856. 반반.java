import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 11856. 반반
 *  2. 풀이핵심
 *  - 문자열 빈도 수 세기, Map 활용
 * 3. 풀이후기
 *  - Map을 자주 쓰던 입장에서 편했던 문제
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

            Map<Character, Integer> map = new HashMap<>();

            for (char ch : str.toCharArray()) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

            boolean isYes = true;

            if (map.size() != 2) isYes = false;

            for (char key : map.keySet()) {
                if (!isYes) break;
                if (map.get(key) != 2) isYes = false;
            }

            sb.append(isYes ? "Yes" : "No");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}