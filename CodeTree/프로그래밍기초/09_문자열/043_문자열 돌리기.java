import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 돌리기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/SPin-SPring/description
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
        sb.append(str).append("\n");
        
        for (int i = 0;i < str.length();i++) {
            str = rightShift(str);
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String rightShift(String str) {
        int lastIdx = str.length() - 1;
        return str.charAt(lastIdx) + str.substring(0, lastIdx);
    }
}