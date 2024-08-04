import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 대문자로 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-in-capital/description
 * 2. 풀이핵심
 *  - 대소문자 변환
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();

        for (char ch : chList) {
            if ('A' <= ch && ch <= 'Z') sb.append(ch);
            else if ('a' <= ch && ch <= 'z') sb.append((char)(ch - ('a' - 'A')));
        }

        System.out.println(sb.toString());
    }
}