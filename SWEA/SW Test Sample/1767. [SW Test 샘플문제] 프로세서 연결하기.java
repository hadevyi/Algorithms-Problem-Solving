import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1767. [SW Test 샘플문제] 프로세서 연결하기
 *  2. 풀이핵심
 *  - DFS를 활용하는 문제
 * 3. 풀이후기
 *  - 확인하는 과정에서 표기와 확인이 까다로웠다.
 */
public class Solution {

    public static int T, N, CORE_COUNT, CONNECT_LENGTH;
    public static int[][] MAP;
    public static List<int[]> pointList; // 확인해야하는 코어들 확인하기
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];
            pointList = new ArrayList<>();
            CORE_COUNT = 0; // 최대로
            CONNECT_LENGTH = Integer.MAX_VALUE; // 최소한으로

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int m = 0;m < N;m++) {
                    int num = Integer.parseInt(st.nextToken());
                    MAP[n][m] = num;

                    // 가장자리에 있지 않는 코어만 확인
                    if (!(n == 0 || m == 0 || n == N - 1 || m == N -1) && num == 1)
                        pointList.add(new int[] {n, m});
                }
            }

            checkCore(0, 0, 0);

            sb.append(CONNECT_LENGTH == Integer.MAX_VALUE ? 0 : CONNECT_LENGTH);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void checkCore(int idx, int length, int count) {
        if (idx == pointList.size()) { // 종료조건
            if (CORE_COUNT < count) {
                CORE_COUNT = count;
                CONNECT_LENGTH = length;
            } else if (CORE_COUNT == count)
                CONNECT_LENGTH = Math.min(length, CONNECT_LENGTH);
            return;
        }

        for (int i = idx;i < pointList.size();i++) {
            int[] point = pointList.get(i);
            for (int d = 0; d < D; d++) {
                if (isConnect(point[0], point[1], d)) {
                    int eachLength = setValue(point[0], point[1], d, 9);
                    checkCore(i + 1, length + eachLength, count + 1);
                    setValue(point[0], point[1], d, 0);
                }
            }
        }
    }

    public static int D = 4;
    public static int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static boolean isConnect(int i, int j, int dir) {
        int ni = i + DELTA[dir][0];
        int nj = j + DELTA[dir][1];

        if (ni < 0 || nj < 0 || ni >= N || nj >= N) return true;
        if (MAP[ni][nj] != 0) return false;
        return isConnect(ni, nj, dir);
    }

    public static int setValue(int i, int j, int dir, int value) {
        int ni = i, nj = j, count = 0;
        while (true) {
            ni += DELTA[dir][0];
            nj += DELTA[dir][1];

            if (ni < 0 || nj < 0 || ni >= N || nj >= N) return count;
            count++;
            MAP[ni][nj] = value;
        }
    }
}
