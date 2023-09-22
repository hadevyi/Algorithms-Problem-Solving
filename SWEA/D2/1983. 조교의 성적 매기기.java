import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1983. 조교의 성적 매기기
 *  2. 풀이핵심
 *  - 비율에 적용하는 수식
 * 3. 풀이후기
 *  - 수식 반영 비율에 오차가 있었음
 */
public class Solution {

    public static int T, N, K, R = 10;
    public static Score[] scores;
    public static String[] RESULT = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            scores = new Score[N];

            for (int n = 0;n < N;n++) {
                st = new StringTokenizer(br.readLine());
                int mid = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());
                int homework = Integer.parseInt(st.nextToken());
                scores[n] = new Score(mid, last, homework);
                if ((n + 1) == K) scores[n].isCheck = true;
            }

            Arrays.sort(scores);

            int rank = -1, gap = N / 10;
            for (int i = 0;i < N;i++)
                if (scores[i].isCheck) {
                    rank = i;
                    break;
                }
            
            sb.append(RESULT[rank / gap]);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Score implements Comparable<Score> {
        boolean isCheck;
        double totalScore;

        public Score(int mid, int last, int homework) {
            this.isCheck = false;
            this.totalScore = (mid * 35) + (last * 45) + (homework * 20);
        }

        @Override
        public int compareTo(Score o) {
            return (int) (o.totalScore - this.totalScore);
        }
    }
}