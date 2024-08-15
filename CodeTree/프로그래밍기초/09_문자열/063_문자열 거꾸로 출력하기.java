import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 거꾸로 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string-backward/description
 * 2. 풀이핵심
 *  - 문자열 비교
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            String str = br.readLine();

            if (str.equals("END")) break;

            sb.append(reverse(str)).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String reverse(String str) {
        char[] chList = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int n = chList.length - 1;n >= 0;n--)
            sb.append(chList[n]);
        return sb.toString();
    }
}