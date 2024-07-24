import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 한 칸씩 밀어내며 뒤집기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/shift-reverse-string/description
 * 2. 풀이핵심
 *  - 문자열 밀기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        for (int n = 0;n < N;n++) {
            int option = Integer.parseInt(br.readLine());

            if (option == 1) str = one(str);
            else if (option == 2) str = two(str);
            else if (option == 3) str = three(str);

            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String one(String str) {
        return str.substring(1) + str.charAt(0);
    }

    private static String two(String str) {
        int lastIdx = str.length() - 1;
        return str.charAt(lastIdx) + str.substring(0, lastIdx);
    }

    private static String three(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1;i >= 0;i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }
}