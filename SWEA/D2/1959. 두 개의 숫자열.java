import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1959. 두 개의 숫자열
 *  2. 풀이핵심
 *  - 단계별로 진행
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, shortLen, longLen;
    public static int[] shortArray, longArray;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            inputSetting(br);

            int ANS = 0;
            for (int bStartIdx = 0, bEndIdx = shortLen; bEndIdx <= longLen; bStartIdx++, bEndIdx++)
                ANS = Math.max(ANS, getArray(bStartIdx, bEndIdx));
            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getArray(int bStartIdx, int bEndIdx) {
        int result = 0;

        for (int aIdx = 0, bIdx = bStartIdx;bIdx < bEndIdx;aIdx++, bIdx++)
            result += shortArray[aIdx] * longArray[bIdx];
        return result;
    }

    public static void inputSetting(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] aArray = new int[N];
        int[] bArray = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) aArray[n] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int m = 0;m < M;m++) bArray[m] = Integer.parseInt(st.nextToken());

        if (N < M) {
            shortLen = N;
            shortArray = aArray.clone();
            longLen = M;
            longArray = bArray.clone();
        } else {
            longLen = N;
            longArray = aArray.clone();
            shortLen = M;
            shortArray = bArray.clone();
        }
    }
}
