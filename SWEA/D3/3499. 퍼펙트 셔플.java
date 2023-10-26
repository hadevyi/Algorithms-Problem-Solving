import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3499. 퍼펙트 셔플
 *  2. 풀이핵심
 *  - list 삽입
 * 3. 풀이후기
 *  - 기준치 내용 정리해서 삽입하기
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<String> list = new ArrayList<>();

            int idx = 1, option = N % 2 == 0 ? N / 2 : N / 2 + 1;
            for (int n = 0;n < N;n++) {
                String str = st.nextToken();

                if (n < option) {
                    list.add(str);
                } else {
                    list.add(idx, str);
                    idx += 2;
                }
            }

            for (String str : list)
                sb.append(str).append(" ");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}