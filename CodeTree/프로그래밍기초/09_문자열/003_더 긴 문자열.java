import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 더 긴 문자열
 *  - 링크 : https://www.codetree.ai/missions/4/problems/longer-string/description
 * 2. 풀이핵심
 *  - 공백없는 문자열 입력받아 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken(), str2 = st.nextToken();
        System.out.println(findLonger(str1, str2));
    }

    public static String findLonger(String str1, String str2) {
        int str1Legnth = str1.length(), str2Length = str2.length();
        if (str1Legnth == str2Length) return "same";
        return str1Legnth > str2Length ? String.format("%s %d", str1, str1Legnth) : String.format("%s %d", str2, str2Length);
    }
}