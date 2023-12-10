import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 시험 통과 여부 확인하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/verify-test-passed/description
 * 2. 풀이핵심
 *  - if-else 구문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if (score >= 80) System.out.println("pass");
        else System.out.println((80 - score) + " more score");
    }
}