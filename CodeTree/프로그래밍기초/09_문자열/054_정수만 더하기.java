import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수만 더하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/add-only-integers/description
 * 2. 풀이핵심
 *  - 대소문자 변환
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();
        int sum = 0;

        for (char ch : chList) {
            if (!('0' <= ch && ch <= '9')) continue;
            sum += ch - '0';
        }

        System.out.println(sum);
    }
}