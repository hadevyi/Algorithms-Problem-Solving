import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 자율주행 자동차
 *  - 출처 : 삼성SW역량테스트 2017 상반기 오후 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/autonomous-driving/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 단계대로 진행했으며 method로 분리함
 * 3. 풀이후기
 *  - method 분리가 생각보다 좋은 방법인거 같다. 앞으로 자주 애용해야지
 */
public class Main {

    public static Car car;
    public static int N, M, Dir, D = 4;
    // 0 위쪽, 1 오른쪽, 2 아래쪽, 3 왼쪽, 좌회전은 index -1 해야함
    public static int[][] MAP, DELTA = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MAP = new int[N][M];

        st = new StringTokenizer(br.readLine());
        car = new Car(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        for (int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                MAP[i][j] = Integer.parseInt(st.nextToken());
        }
        MAP[car.i][car.j] = 2;

        int step = 0;
        while (true) {
            boolean isMove = false;
            for (int d = 0; d < D;d++) {
                isMove = checkLeftArea();
                if (isMove) break;
            }

            if (!isMove) {
                if (!moveBack())
                    break;
            }
        }

        System.out.println(getTotalMoveArea());
    }

    public static int getTotalMoveArea() {
        int count = 0;
        for (int i = 0;i < N;i++)
            for (int j = 0;j < M;j++)
                if (MAP[i][j] == 2)
                    count++;
        return count;
    }

    public static boolean moveBack() {
        int carIdx = car.dir;
        for (int i = 0;i < 2;i++)
            carIdx = carIdx + 1 == D ? 0 : carIdx + 1;

        int ni = car.i + DELTA[carIdx][0];
        int nj = car.j + DELTA[carIdx][1];

        if (ni < 0 || nj < 0 || ni >= N || nj >= M || MAP[ni][nj] == 1) return false;

        car.i = ni;
        car.j = nj;
        return true;
    }

    public static boolean checkLeftArea() {
        car.dir = car.dir - 1 < 0 ? 3 : car.dir - 1;
        int ni = car.i + DELTA[car.dir][0];
        int nj = car.j + DELTA[car.dir][1];

        if (ni < 0 || nj < 0 || ni >= N || nj >= M || MAP[ni][nj] != 0) return false;

        car.i = ni;
        car.j = nj;
        MAP[ni][nj] = 2;
        return true;
    }

    public static class Car {
        int i;
        int j;
        int dir;

        public Car(int i, int j, int dir) {
            this.i = i;
            this.j = j;
            this.dir = dir;
        }

        @Override
        public String toString() {
            return "i : " + this.i + " j : " + this.j + " dir : " + this.dir;
        }
    }
}
