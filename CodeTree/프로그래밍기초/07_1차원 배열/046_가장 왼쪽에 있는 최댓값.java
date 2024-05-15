import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 왼쪽에 있는 최댓값
 *  - 링크 : https://www.codetree.ai/missions/4/problems/leftmost-max-value/description
 *  2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, IDX;
    public static int[] ARR;
    public static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) ARR[n] = Integer.parseInt(st.nextToken());
        findMaxIndex(N - 1);
        System.out.println(sb.toString());
    }

    public static void findMaxIndex(int lastIdx) {
        if (lastIdx < 0) {
            return;
        }
        
        int maxValue = ARR[lastIdx], maxIndex = lastIdx;
        for (int idx = lastIdx;idx >= 0;idx--) {
            if (ARR[idx] < maxValue) continue;
            maxValue = ARR[idx];
            maxIndex = idx;
        }

        sb.append(maxIndex + 1).append(" ");
        findMaxIndex(maxIndex - 1);
    }
}