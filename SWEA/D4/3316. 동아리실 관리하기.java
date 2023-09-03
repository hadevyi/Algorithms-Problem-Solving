import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 3316. 동아리실 관리하기
 *  2. 풀이핵심
 *  - 비트마스킹, 이전을 기준으로 &, | 처리
 * 3. 풀이후기
 *  - 비트마스킹으로 접근하는거조차 어려운 문제였다.
 */
public class Solution {

    public static int T, DIV = 1000000007;
    public static int[][] DP;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            String str = br.readLine();
            int N = str.length();
            DP = new int[16][N];

            // 1번째 날 체킹
            int check = 1 | (1 << (str.charAt(0) - 'A'));
            for (int n = 1;n < 16;n++) {
                if ((check & n) == check) {
                    DP[n][0] = 1;
                }
            }

            // 2~N번째 날 체킹
            for (int n = 1;n < N;n++) {
                int now = 1 << (str.charAt(n) - 'A'); // n번째 담당자 비트 만들기 0010

                for (int i = 1;i < 16;i++) {
                    if ((i & now) == 0) continue;

                    for (int j = 1;j < 16;j++) {
                        if ((i & j) == 0) continue;

                        DP[i][n] = (DP[i][n] + DP[j][n - 1]) % DIV;
                    }
                }
            }

            int total = 0;
            for (int n = 1;n < 16;n++)
                total = (total + DP[n][N - 1]) % DIV;

            sb.append(total);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
