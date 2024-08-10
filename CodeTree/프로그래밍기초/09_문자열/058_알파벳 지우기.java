import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 알파벳 지우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/remove-alphabet/description
 * 2. 풀이핵심
 *  - 문자열을 정수로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        for (int n = 0;n < 2;n++) {
            sum += parseInt(br.readLine());
        }

        System.out.println(sum);
    }

    private static Integer parseInt(String str) {
        StringBuffer sb = new StringBuffer();
        for (char ch : str.toCharArray()) {
            if (ch < '0' || ch > '9') continue;
            sb.append(ch);
        }
        return Integer.parseInt(sb.toString());
    }
}