import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4038. [Professional] 단어가 등장하는 횟수
 *  2. 풀이핵심
 *  - Rabin-Karp 풀이
 * 3. 풀이후기
 *  - Rabin-Karp를 하는 방법은 알았지만, 기준 값을 소수로 어느정도 큰 값을 해야한다는 것을 알 수 있었다.
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            String B = br.readLine(); // 대상 문자열
            String S = br.readLine(); // 찾을 문자열

            sb.append(findRabinKarp(B, S));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int BASIC = 67;
    // rolling 할 때의 뺄샘 시 큰 값을 뺄 수 있도록 2보다 훨씬 큰 소수를 책정함 (67이 현재 문제의 경계값)
    public static int findRabinKarp(String B, String S) {
        if (B.length() < S.length()) return 0;

        long bHashValue = 0, sHashValue = 0;
        long MAX_MULTI = 1;

        for (int idx = S.length() - 1;idx >= 0;idx--) {
            bHashValue = bHashValue + (B.charAt(idx) * MAX_MULTI);
            sHashValue = sHashValue + (S.charAt(idx) * MAX_MULTI);
            if (idx > 0) MAX_MULTI *= BASIC;
        }

        int ANS = 0;
        if (bHashValue == sHashValue) ANS++; // 사전에 정리한 값으로 해쉬값 먼저 확인하기

        int startIdx = 0;
        for (int endIdx = S.length();endIdx < B.length();endIdx++) {
            bHashValue = BASIC * (bHashValue - (B.charAt(startIdx++) * MAX_MULTI)) + B.charAt(endIdx);
            if (bHashValue == sHashValue) ANS++;
        }

        return ANS;
    }
}
