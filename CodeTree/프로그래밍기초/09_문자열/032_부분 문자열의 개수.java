import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 부분 문자열의 개수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-substrings/description
 * 2. 풀이핵심
 *  - 문자열 찾기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originStr = br.readLine(), findStr = br.readLine();

        int count = 0;
        for (int idx = 0;idx < originStr.length() - findStr.length() + 1;idx++) {
            if (!originStr.substring(idx, idx + findStr.length()).equals(findStr)) continue;
            count++;
        }

        System.out.println(count);
    }
}