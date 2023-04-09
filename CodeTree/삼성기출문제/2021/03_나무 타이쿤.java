import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 나무 타이쿤
 *  - 출처 : 삼성SW역량테스트 2021 상반기 오후 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/tree-tycoon/description?page=2&pageSize=20&username=
 *  2. 풀이핵심
 *  - 단계별로 순차대로 작성하기
 * 3. 풀이후기
 *  - 단계마다 함수로 분리하는 것이 꽤나 편했음
 */
public class Main {

    public static int N, M; // N 격자 크기, M 총 년 수
    public static int[][] MAP;
    public static ArrayList<Point> pointArrayList;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MAP = new int[N][N];
        pointArrayList = new ArrayList<>();

        for (int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0;j < N;j++)
                MAP[i][j] = Integer.parseInt(st.nextToken());
        }
        setCheckDefault();

        for (int m = 0;m < M;m++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()) - 1;
            int p = Integer.parseInt(st.nextToken());
            doTree(d, p); // 움직이기
            growTree(); // 1씩 자라게 하기
            checkCrossLine(); // 4방 확인하기
            cutTree(); // 2이상인 애들 2씩 짜르고 그 위치에 영양제 뿌리기
        }

        System.out.println(getTotalResult());
    }

    // → ↗ ↑ ↖ ← ↙ ↓ ↘
    public static int D = 8;
    public static int[][] DELTA = {{0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}};

    public static void doTree(int d, int repeat) {
        for (int r = 0;r < repeat;r++)
            for (Point point : pointArrayList) {
                int ni = point.i + DELTA[d][0];
                int nj = point.j + DELTA[d][1];

                if (ni < 0) ni = N - 1;
                if (ni >= N) ni = 0;
                if (nj < 0) nj = N - 1;
                if (nj >= N) nj = 0;

                point.i = ni;
                point.j = nj;
            }
    }

    public static void growTree() {
        for (Point point : pointArrayList)
            MAP[point.i][point.j] += 1;
    }

    public static void checkCrossLine() {
        for (Point point : pointArrayList) {
            int count = 0;
            for (int idx = 1;idx < D;idx += 2) {
                int ni = point.i + DELTA[idx][0];
                int nj = point.j + DELTA[idx][1];

                if (ni < 0 || ni >= N || nj < 0 || nj >= N) continue;

                if (MAP[ni][nj] >= 1) count++;
            }
            MAP[point.i][point.j] += count;
        }
    }

    public static int getTotalResult() {
        int result = 0;
        for (int[] map : MAP)
            for (int data : map)
                result += data;
        return result;
    }

    public static void cutTree() {
        ArrayList<Point> newPointArrayList = new ArrayList<>();

        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (MAP[i][j] < 2) continue;

                Point newPoint = new Point(i, j);
                if (isExistPoint(newPoint)) continue;
                MAP[i][j] -= 2;
                newPointArrayList.add(newPoint);
            }
        }

        pointArrayList = newPointArrayList;
    }

    public static boolean isExistPoint(Point newPoint) {
        for (Point point : pointArrayList)
            if (point.i == newPoint.i && point.j == newPoint.j)
                return true;
        return false;
    }

    public static void setCheckDefault() {
        for (int i = N - 2;i < N;i++)
            for (int j = 0;j <= 1;j++)
                pointArrayList.add(new Point(i, j));
    }

    public static class Point {
        int i;
        int j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
