import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : e 제거하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/e-to-remove/description
 * 2. 풀이핵심
 *  - 문자 삭제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        int findIdx = str.indexOf('e');

        sb.append(str.substring(0, findIdx));
        if (findIdx + 1 <= str.length()) sb.append(str.substring(findIdx + 1));

        System.out.println(sb.toString());
    }
}