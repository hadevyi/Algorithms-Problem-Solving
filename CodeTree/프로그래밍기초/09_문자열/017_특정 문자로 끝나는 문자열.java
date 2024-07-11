import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 문자로 끝나는 문자열
 *  - 링크 : https://www.codetree.ai/missions/4/problems/string-ending-with-specific-character/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static String[] ARR = new String[N];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = 0;n < N;n++) ARR[n] = br.readLine();
        char ch = br.readLine().charAt(0);

        StringBuffer sb = new StringBuffer();
        for (String data : ARR) {
            if (data.charAt(data.length() - 1) != ch) continue;
            sb.append(data).append("\n");
        }

        System.out.println(sb.length() == 0 ? "None" : sb.toString());
    }
}