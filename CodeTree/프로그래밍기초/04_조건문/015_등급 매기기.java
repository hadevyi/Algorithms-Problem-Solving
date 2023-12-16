import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 등급 매기기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/ranking/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        char ch = ' ';
        if (score >= 90) ch = 'A';
        else if (score >= 80) ch = 'B';
        else if (score >= 70) ch = 'C';
        else if (score >= 60) ch = 'D';
        else ch = 'F';

        System.out.println(ch);
    }
}