import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 그 다음 알파벳
 *  - 링크 : https://www.codetree.ai/missions/4/problems/next-alphabet/description
 * 2. 풀이핵심
 *  - 아스키 코드
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);
        System.out.println(ch == 'z' ? 'a' : (char) (ch + 1));
    }
}