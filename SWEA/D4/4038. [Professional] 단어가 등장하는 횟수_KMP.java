import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4038. [Professional] 단어가 등장하는 횟수
 *  2. 풀이핵심
 *  - KMP 알고리즘
 * 3. 풀이후기
 *  - KMP의 각 단계나 이해, 코드 작성에 어려움이 있었다. 알면 편한 알고리즘이라 나중에 한 번 더 정리해보아야겠다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            String B = br.readLine();
            String S = br.readLine();

            sb.append(KMP(B, S));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int KMP(String B, String S) {
        int ANS = 0;
        int[] failTable = getFailTable(S);

        int sIdx = 0;
        for (int bIdx = 0;bIdx < B.length();bIdx++) {
            while (sIdx > 0 && B.charAt(bIdx) != S.charAt(sIdx)) {
                sIdx = failTable[sIdx - 1];
            }

            if (B.charAt(bIdx) == S.charAt(sIdx)) {
                if (sIdx == S.length() - 1) {
                    sIdx = failTable[sIdx];
                    ANS++;
                } else sIdx++;
            }
        }

        return ANS;
    }

    public static int[] getFailTable(String str) {
        int[] failTable = new int[str.length()];
        int j = 0;
        for (int i = 1;i < str.length();i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = failTable[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)){
                failTable[i] = ++j;
            }
        }
        return failTable;
    }
}
