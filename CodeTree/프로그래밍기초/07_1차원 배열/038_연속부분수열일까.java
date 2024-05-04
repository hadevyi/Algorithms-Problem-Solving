import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 연속부분수열일까
 *  - 링크 : https://www.codetree.ai/missions/4/problems/contiguous-array-or-not/description
 * 2. 풀이핵심
 *  - 탐색
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, M;
    public static int[] ARR1, ARR2;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ARR1 = new int[N];
        ARR2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR1[n] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int m = 0;m < M;m++)
            ARR2[m] = Integer.parseInt(st.nextToken());

        
        System.out.println(isContinuousPartialSequence() ? "Yes" : "No");
    }

    public static boolean isContinuousPartialSequence() {
        List<Integer> list = findAStartIndex(ARR2[0]);
        if (list == null) return false;

        for (int s : list) {
            boolean isSame = true;
            for (int aIdx = s, bIdx = 0;bIdx < M;aIdx++, bIdx++)
                isSame = isSame && (ARR1[aIdx] == ARR2[bIdx]);
            if (isSame) return true;
        }
        return false;
    }

    public static List<Integer> findAStartIndex(int bStartValue) {
        List<Integer> list = new ArrayList<>();
        for (int n = 0;n <= N - M;n++)
            if (ARR1[n] == bStartValue)
                list.add(n);
        return list.size() == 0 ? null : list;
    }
} 