import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 규칙에 따라 밀기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/push-by-the-rules/description
 * 2. 풀이핵심
 *  - 문자열 밀기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        char[] commands = br.readLine().toCharArray();

        for (char command : commands) {
            if (command == 'L') str = leftShift(str);
            else str = rightShift(str);
        }

        System.out.println(str);
    }

    private static String leftShift(String str) {
        return str.substring(1) + str.charAt(0);
    }

    private static String rightShift(String str) {
        int lastIdx = str.length() - 1;
        return str.charAt(lastIdx) + str.substring(0, lastIdx);
    }
}