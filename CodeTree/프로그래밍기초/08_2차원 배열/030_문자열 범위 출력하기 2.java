import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 범위 출력하기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string-in-range-2/description
 * 2. 풀이핵심
 *  - 문자열 순회하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int max = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        for (int idx = str.length() - 1, count = 0;idx >= 0 && count < max;idx--, count++)
            sb.append(str.charAt(idx));
        System.out.println(sb.toString());
    }
}