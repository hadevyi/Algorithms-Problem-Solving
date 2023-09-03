import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 9999. 광고 시간 정하기
 *  2. 풀이핵심
 *  - Binary Search 하기
 * 3. 풀이후기
 *  - 한 번에 접근하기 모호했다. 몇 날 며칠이 걸린 문제
 */
public class Solution {

    public static class AD {
        int start, end, cumulativeSum;
        public AD(int start, int end, int cumulativeSum) {
            this.start = start;
            this.end = end;
            this.cumulativeSum = cumulativeSum;
        }
    }

    public static int T, L, N, MAX;
    public static AD[] ads;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            settingInput(br);
            searchMaxLength();
            sb.append(MAX);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void searchMaxLength() {
        for (int n = 0;n < N;n++) {
            AD now = ads[n];
            int targetTime = now.start + L;
            AD target = findTartgetAD(targetTime);

            int result = (target.cumulativeSum - now.cumulativeSum) + (now.end - now.start);

            if (target.start < targetTime && targetTime < target.end) {
                result -= target.end - targetTime;
            } else if (targetTime < target.end) {
                result -= target.end - target.start;
            }

            MAX = Math.max(MAX, result);
        }
    }

    public static AD findTartgetAD(int targetTime) {
        int start = 0, end = N - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (ads[mid].end >= targetTime) end = mid;
            else start = mid + 1;
        }

        return ads[end];
    }

    public static void settingInput(BufferedReader br) throws Exception {
        MAX = 0;
        L = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        ads = new AD[N];

        int cumulativeSum = 0;
        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            cumulativeSum += end - start; // 길이
            ads[n] = new AD(start, end, cumulativeSum);
        }
    }
}
