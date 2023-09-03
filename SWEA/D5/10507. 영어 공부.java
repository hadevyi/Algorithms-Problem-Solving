import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10507. 영어 공부
 *  2. 풀이핵심
 *  - 투포인터를 사용해서 진행한다.
 * 3. 풀이후기
 *  - isVisited의 상태에 따라 사용할 수 있는 범주가 달라지고, 그에 대해 체크값이 달라진다.
 *  - 최대값(MAX) 설정때문에 fail을 받았는데, 사용할 수 있는 P의 개수에 하나를 더한 값으로 초기화해야한다.
 *  - 원래의 목표는 이진탐색이기 떄문에, 이 문제가 이진탐색으로 어떻게 가능할지 고민해봐야겠다.
 */
public class Solution {

    public static int T, N, P, MAX;
    public static int[] ARR;
    public static boolean[] isVisited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            settingInput(br);
            findMaxDays();
            sb.append(MAX);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void findMaxDays() {
        int start = 1, end = 1, count = 0;

        while (end < MAX_SIZE) {
            if (isVisited[end]) {
                count++;
                end++;
                MAX = Math.max(MAX, count);
            } else {
                if (P == 0) {
                    MAX = Math.max(MAX, count);
                    if (!isVisited[start]) P++;
                    start++;
                    count--;
                } else {
                    P--;
                    count++;
                    end++;
                }
            }
        }
    }

    public static int MAX_SIZE = 1000001;
    public static void settingInput(BufferedReader br) throws Exception{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ARR = new int[N];
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        MAX = P + 1;
        isVisited = new boolean[MAX_SIZE];

        for (int arr : ARR)
            isVisited[arr] = true;
    }
}
