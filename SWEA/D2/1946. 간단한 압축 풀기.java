import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1946. 간단한 압축 풀기
 *  2. 풀이핵심
 *  - 입력값 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, N;
    public static List<String> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append("\n");

            N = Integer.parseInt(br.readLine());
            list = new ArrayList<>();

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int number = Integer.parseInt(st.nextToken());

                for (int num = 0;num < number;num++)
                    list.add(str);
            }

            for (int size = 0;size < list.size();size++) {
                sb.append(list.get(size));
                if ((size + 1) % 10 == 0) sb.append("\n");
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}