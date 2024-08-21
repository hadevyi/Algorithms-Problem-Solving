import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 미는 횟수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-pushes/description
 * 2. 풀이핵심
 *  - 문자열 비교
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine(), B = br.readLine();
        int count = A.equals(B) ? 0 : countShift(A, B);
        System.out.println(count > A.length() ? -1 : count);
    }

    private static String rightShift(String str) {
        int lastIdx = str.length() - 1;
        return str.substring(1) + str.charAt(0);
    }

    private static int countShift(String A, String B) {
        int count = 1;
        for (count = 1;count <= A.length();count++) {
            String newB = rightShift(B);
            if (A.equals(newB)) break;
            B = newB;
        }
        return count;
    }
}