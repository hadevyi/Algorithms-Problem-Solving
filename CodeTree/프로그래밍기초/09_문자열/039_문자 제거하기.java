import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자 제거하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/del-char/description
 * 2. 풀이핵심
 *  - 문자 삭제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer sb = new StringBuffer();

        while (str.length() > 1) {
            int idx = Integer.parseInt(br.readLine());

            if (idx >= str.length()) {
                str = str.substring(0, str.length() - 1);
            } else {
                char[] chList = str.toCharArray();
                StringBuffer renew = new StringBuffer();
                for (int i = 0;i < str.length();i++) {
                    if (i == idx) continue;
                    renew.append(chList[i]);
                }
                str = renew.toString();
            }

            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}