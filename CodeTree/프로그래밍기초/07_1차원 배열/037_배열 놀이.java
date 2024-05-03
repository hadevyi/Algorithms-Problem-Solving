import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 놀이
 *  - 링크 : https://www.codetree.ai/missions/4/problems/play-with-array/description
 * 2. 풀이핵심
 *  - 탐색
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, Q;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        ARR = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int q = 0;q < Q;q++) {
            st = new StringTokenizer(br.readLine());

            int option = Integer.parseInt(st.nextToken());
            String result = null;

            if (option == 1) result = functionOne(Integer.parseInt(st.nextToken())- 1);
            else if (option == 2) result = functionTwo(Integer.parseInt(st.nextToken()));
            else result = functionThree(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
            
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static String functionOne(int a) {
        return Integer.toString(ARR[a]);
    }

    public static String functionTwo(int b) {
        for (int n = 0;n < N;n++)
            if (ARR[n] == b)
                return Integer.toString(n + 1);
        return Integer.toString(0);
    }

    public static String functionThree(int s, int e) {
        StringBuffer sb = new StringBuffer();
        for (int i = s;i <= e;i++)
            sb.append(ARR[i]).append(" ");
        return sb.toString();
    }
}