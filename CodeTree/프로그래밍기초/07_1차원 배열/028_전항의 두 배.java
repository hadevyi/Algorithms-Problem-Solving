import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 전항의 두 배
 *  - 링크 : https://www.codetree.ai/missions/4/problems/twice-the-previous/description
 * 2. 풀이핵심
 *  - 배열 만들기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new int[N];
        ARR[0] = Integer.parseInt(st.nextToken());
        ARR[1] = Integer.parseInt(st.nextToken());

        for (int n = 2;n < N;n++)
            ARR[n] = ARR[n - 1] + 2 * ARR[n - 2];

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            sb.append(ARR[n]).append(" ");
        System.out.println(sb.toString());
    }
}