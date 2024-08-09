import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수만 추출하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/extract-only-integers/description
 * 2. 풀이핵심
 *  - 문자열을 정수로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += parseInt(st.nextToken());
        }

        System.out.println(sum);
    }

    private static Integer parseInt(String str) {
        StringBuffer sb = new StringBuffer();
        for (char ch : str.toCharArray()) {
            if (!('0' <= ch && ch <= '9')) break;
            sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }
}