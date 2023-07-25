import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3456. 직사각형 길이 찾기
 *  2. 풀이핵심
 *  - 갯수를 파악해서 진행하기
 * 3. 풀이후기
 *  - 간단한 풀이였다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0;i < 3;i++) {
                int num = Integer.parseInt(st.nextToken());

                if (map.containsKey(num)) map.put(num, map.get(num) + 1);
                else map.put(num, 1);
            }

            if (map.keySet().size() == 1) {
                for (int key : map.keySet()) {
                    sb.append(key);
                    break;
                }
            } else {
                for (int key : map.keySet()) {
                    if (map.get(key) == 2) continue;
                    sb.append(key);
                }
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}