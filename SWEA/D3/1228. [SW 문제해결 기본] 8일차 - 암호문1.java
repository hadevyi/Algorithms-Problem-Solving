import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1228. [S/W 문제해결 기본] 8일차 - 암호문1
 *  2. 풀이핵심
 *  - 단계를 활용한 문제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {
    public static int T = 10;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            List<String> list = new ArrayList<>();

            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int n = 0;n < N;n++)
                list.add(st.nextToken());

            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int n = 0;n < N;n++) {
                String command = st.nextToken();
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                List<String> addList = new ArrayList<>();
                for (int y = 0;y < Y;y++)
                    addList.add(st.nextToken());

                list.addAll(X, addList);
            }

            for (int i = 0;i < 10;i++)
                sb.append(list.get(i)).append(" ");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}