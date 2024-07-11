import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 문자의 유무
 *  - 링크 : https://www.codetree.ai/missions/4/problems/specific-character-presence/description
 * 2. 풀이핵심
 *  - 문자열 찾기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.printf("%s %s", isExist(str, "ee"), isExist(str, "ab"));
    }

    public static String isExist(String originStr, String findStr) {
        if (originStr.contains(findStr)) return "Yes";
        return "No";
    }
}