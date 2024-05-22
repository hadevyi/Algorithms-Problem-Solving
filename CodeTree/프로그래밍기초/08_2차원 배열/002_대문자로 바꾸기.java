import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 대문자로 바꾸기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/change-to-capital/description
 * 2. 풀이핵심
 *  - 2차원 배열 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 5, M = 3;
    public static char[][] ARR = new char[N][M];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                ARR[n][m] = st.nextToken().charAt(0);
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++)
                sb.append((char) (ARR[n][m] - ('a' - 'A'))).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}