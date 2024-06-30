import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : Run Length 인코딩
 *  - 링크 : https://www.codetree.ai/missions/4/problems/run-length-encoding/description
 * 2. 풀이핵심
 *  - 문자열 순회하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();

        StringBuffer sb = new StringBuffer();
        int count = 1;
        char ch = chArr[0];
        for (int c = 1;c < chArr.length;c++) {
            if (ch != chArr[c]) {
                sb.append(ch).append(count);
                ch = chArr[c];
                count = 1;
            } else count++;
        }

        if (count > 0) sb.append(ch).append(count);
        String result = sb.toString();
        System.out.printf("%d\n%s", result.length(), result);
    }
}