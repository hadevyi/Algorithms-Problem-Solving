import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 로또
 *  - 번호 : 6603
 *  - 링크 : https://www.acmicpc.net/problem/6603
 *  2. 풀이핵심
 *  - 조합 구현하기
 * 3. 풀이후기
 *  - 가장 편한 방법으로 구현해보았음. 오랜만이라 어색하긴 한데, 결과가 잘 나왔음.
 */
public class Main {

    static int K, N = 6;
    static int[] S, RESULT;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            K = Integer.parseInt(st.nextToken());

            if (K == 0) break;

            S = new int[K];
            RESULT = new int[N];
            for (int k = 0;k < K;k++)
                S[k] = Integer.parseInt(st.nextToken());

            combination(0,0);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static void combination(int srcIdx, int tgtIdx) {
        if (tgtIdx == N) {
            print();
            return;
        }

        for (int i = srcIdx;i < K;i++) {
            RESULT[tgtIdx] = S[i];
            combination(i + 1, tgtIdx + 1);
        }
    }

    public static void print() {
        for (int n = 0;n < N;n++)
            sb.append(RESULT[n]).append(" ");
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\n");
    }
}
