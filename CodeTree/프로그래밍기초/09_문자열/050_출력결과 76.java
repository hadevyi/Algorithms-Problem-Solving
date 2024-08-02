import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 76
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201831/description
 * 2. 풀이핵심
 *  - 아스키 코드
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String str = "Lucky Boy";
        int i, score = 0;
        for (i = 0; i < str.length(); i++) {  
            int ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') {   // 대문자만 더한다.
                score += ch - 'A' + 1;      // L B 만 들어온다. L(12) + B(2) = 14
            }
        }
        System.out.println(score);
    }
}