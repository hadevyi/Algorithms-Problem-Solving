import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 길이의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-length-of-string/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0, countA = 0;
        for (int n = 0;n < N;n++) {
            String str = br.readLine();
            sum += str.length();
            if (str.charAt(0) == 'a') countA++;
        }

        System.out.printf("%d %d", sum, countA);
    }
}