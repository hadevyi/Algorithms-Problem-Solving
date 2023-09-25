import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 테트리스 블럭 안의 합 최대화 하기
 *  - 출처 : 삼성SW역량테스트 2017 상반기 오전1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/problems/max-sum-of-tetris-block/description?page=1&pageSize=20&tier=1%2C12&statuses=Ready
 *  2. 풀이핵심
 *  - 방향 정리
 * 3. 풀이후기
 *  - 테트리스 블럭을 정돈하면 간편했던 문제였음
 */
public class Main {

    public static int N, M, MAX;
    public static int[][] MAP;
    public static int[][][] BLOCKS;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        settingInput(br);

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++)
                MAX = Math.max(MAX, getMaxAreaSize(n, m));
        }

        System.out.println(MAX);
    }

    public static int getMaxAreaSize(int i, int j) {
        int result = -1;

        for (int[][] blocks : BLOCKS)
            result = Math.max(result, getAreaSize(i, j, blocks));

        return result;
    }

    public static int getAreaSize(int i, int j, int[][] block) {
        int sum = MAP[i][j];

        for (int[] eachBlock : block) {
            int ni = i + eachBlock[0];
            int nj = j + eachBlock[1];

            if (ni < 0 || nj < 0 || ni >= N || nj >= M) return -1;
            sum += MAP[ni][nj];
        }

        return sum;
    }

    public static void settingInput(BufferedReader br) throws Exception {
        MAX = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MAP = new int[N][M];

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                MAP[n][m] = Integer.parseInt(st.nextToken());
        }

        BLOCKS = new int[][][] {
                {{0, 1}, {0, 2}, {0, 3}},
                {{0, 1}, {1, 0}, {1, 1}},
                {{0, 1}, {-1, 1}, {-1, 2}},
                {{0, 1}, {1, 1}, {1, 2}},
                {{1, -1}, {1, 0}, {1, 1}},
                {{0, 1}, {0, 2}, {1, 1}},
                {{0, 1}, {0, 2}, {-1, 2}},
                {{0, 1}, {0, 2}, {1, 0}},
                {{1, 0}, {1, 1}, {1, 2}},
                {{0, 1}, {0, 2}, {1, 2}},
                {{1, 0}, {1, 1}, {2, 1}},
                {{1, 0}, {1, -1}, {2, -1}},
                {{1, 0}, {2, 0}, {1, 1}},
                {{1, 0}, {1, -1}, {2, 0}},
                {{1, 0}, {2, 0}, {2, 1}},
                {{0, 1}, {1, 1}, {2, 1}},
                {{0, 1}, {1, 0}, {2, 0}},
                {{1, 0}, {2, 0}, {2, -1}},
                {{1, 0}, {2, 0}, {3, 0}}
        };
    }
}