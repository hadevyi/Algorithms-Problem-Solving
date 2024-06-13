import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 74
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201829/description
 * 2. 풀이핵심
 *  - 공백없는 문자열 입력받아 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "abcde"; 
        char[] str2 = new char[]{'a','b','c','d','e','f','g'};
        int len1 = str1.length() - 2; // 5 - 2 = 3
        int len2 = str2.length - 3; // 7 - 3 = 4

        System.out.println(str1.charAt(len2) + " " + str2[len1]);
        // e d
    }
}