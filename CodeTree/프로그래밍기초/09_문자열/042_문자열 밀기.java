import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 밀기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/push-char/description
 * 2. 풀이핵심
 *  - 문자열 밀기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.substring(1) + str.charAt(0));
    }
}