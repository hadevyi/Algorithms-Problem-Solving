import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소문자와 숫자
 *  - 링크 : https://www.codetree.ai/missions/4/problems/letter-and-number/description
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
            if (('0' <= ch && ch <= '9') || ('a' <= ch && ch <= 'z')) sb.append(ch);
            else if ('A' <= ch && ch <= 'Z') sb.append((char) (ch + ('a' - 'A')));
        }

        System.out.println(sb.toString());
    }
}