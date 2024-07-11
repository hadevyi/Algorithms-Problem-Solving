import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 문자열을 이어붙였을 때
 *  - 링크 : https://www.codetree.ai/missions/4/problems/when-two-strings-are-concatenated/description
 * 2. 풀이핵심
 *  - 문자열 concat
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println((str1 + str2).equals(str2 + str1));
    }
}