import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 바이러스 백신
 *  - 출처 : 삼성SW역량테스트 2019 상반기 오후 2번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/problems/vaccine-for-virus/description?page=2&pageSize=20
 *  2. 풀이핵심
 *  - bfs 및 선택케이스
 * 3. 풀이후기
 *  - 경계치 값을 고려하지 않아 fail이 3번은 발생한 문제이다. 각 경우의 수를 잘 고려하는 것이 중요하다는 것을 상기하였다.
 */
public class Main {

    // 지도 상세 정보 값
    public static final int VIRUS = 0;
    public static final int WALL = 1;
    public static final int HOSPITAL = 2;

    public static int N;                    // 지도의 한 변의 길이 (3 <= N <= 50)
    public static int M;                    // 선택해야하는 병원 개수 (1 <= M <= 10)
    public static int MIN;                  // 정답 : 바이러스를 없애는 최소 시간 (불가능하다면, -1)
    public static int COUNT;                // 없애야하는 바이러스 개수
    public static int[][] MAP;              // 지도의 정보
    public static List<Point> HOSPITAL_LIST;// 병원 정보 (M <= SIZE <= 10)
    public static void main(String[] args) throws Exception {
        init();

        if (COUNT == 0) {
            MIN = 0;
        } else {
            Queue<String> cases = getCase();
            
            while (!cases.isEmpty()) {
                String eachCase = cases.poll();
                int time = findTime(eachCase);
                MIN = Math.min(MIN, time);
            }
        }

        System.out.println(MIN == Integer.MAX_VALUE ? -1 : MIN);
    }

    public static int D = 4;
    public static int[][] DELTA = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static int findTime(String bit) {
        boolean[][] isVisited = new boolean[N][N];
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0;i < bit.length();i++) {
            int idx = bit.charAt(i) - '0';
            if (idx == 0) continue;
            Point point = HOSPITAL_LIST.get(i);
            queue.offer(point);
            isVisited[point.x][point.y] = true;
        }

        int step = -1, remind = COUNT;

        while (!queue.isEmpty()) {
            if (remind == 0) break;

            step++;
            int SIZE = queue.size();
            
            for (int size = 0;size < SIZE;size++) {
                Point point = queue.poll();
                if (MAP[point.x][point.y] == VIRUS) remind--;
                if (remind == 0) break;

                for (int d = 0;d < D;d++) {
                    int nx = point.x + DELTA[d][0];
                    int ny = point.y + DELTA[d][1];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    if (MAP[nx][ny] == WALL) continue;
                    if (isVisited[nx][ny]) continue;

                    queue.offer(new Point(nx, ny));
                    isVisited[nx][ny] = true;
                }
            }
        }

        return remind == 0 ? step : Integer.MAX_VALUE;
    }

    public static Queue<String> getCase() {
        Queue<String> result = new LinkedList<>();
        int SIZE = HOSPITAL_LIST.size();

        for (int i = 1;i < (1 << SIZE);i++) {
            StringBuffer sb = new StringBuffer();
            String bit = Integer.toBinaryString(i);

            for (int add = 0;add < SIZE - bit.length();add++)
                sb.append("0");
            sb.append(bit);

            String str = sb.toString();
            if (isCorrect(str))
                result.offer(str);
        }
        return result;
    }

    public static boolean isCorrect(String str) {
        int count = 0;
        for (char ch : str.toCharArray())
            if (ch == '1')
                count++;
        return count == M;
    }

    public static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        MAP = new int[N][N];
        HOSPITAL_LIST = new ArrayList<>();

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < N;m++) {
                int num = Integer.parseInt(st.nextToken());
                MAP[n][m] = num;
                if (num == HOSPITAL) HOSPITAL_LIST.add(new Point(n, m));
                else if (num == VIRUS) COUNT++;
            }
        }

        MIN = Integer.MAX_VALUE;
    }

    public static class Point {
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
