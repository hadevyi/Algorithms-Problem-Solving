import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 점수대 파악하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-out-the-score-range/description
 * 2. 풀이핵심
 *  - count 배열
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, C = 10;
    public static int[] COUNT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.countTokens();
        COUNT = new int[C];

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            if (num < 10) continue;
            COUNT[(num / 10) - 1]++;
        }

        StringBuffer sb = new StringBuffer();
        for (int c = C - 1;c >= 0;c--)
            sb.append((c + 1) * 10).append(" - ").append(COUNT[c]).append("\n");
        System.out.println(sb.toString());
    }
}