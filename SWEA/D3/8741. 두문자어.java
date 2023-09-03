import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8741. 두문자어
 *  2. 풀이핵심
 *  - 문자열 확인
 * 3. 풀이후기
 *  - 간단한 풀이가 가능했던 문제
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
            int SIZE = st.countTokens();

            for (int size = 0;size < SIZE;size++) {
                char ch = st.nextToken().charAt(0);
                sb.append((char)(ch - ('a' - 'A')));
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
