import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 알파벳에 따른 평가
 *  - 링크 : https://www.codetree.ai/missions/4/problems/evaluation-by-alphabet/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);

        String result = null;
        switch (ch) {
            case 'S' : result = "Superior"; break;
            case 'A' : result = "Excellent"; break;
            case 'B' : result = "Good"; break;
            case 'C' : result = "Usually"; break;
            case 'D' : result = "Effort"; break;
            default : result = "Failure";
        }

        System.out.println(result);
    }
}