import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8898. 3차원 농부
 *  2. 풀이핵심
 *  - binary search
 * 3. 풀이후기
 *  - 정말 오랜만에 내가 설계한 코드대로 1번의 시도만에 성공한 코드!
 */
public class Solution {

    public static class Point implements Comparable<Point> {
        int x, y, z;
        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public int compareTo(Point o) {
            return this.z - o.z;
        }
    }

    public static int T, N, M, cowRow, horseRow, MIN, COUNT;
    public static Point[] cowPoint, horsePoint;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            settingInput(br); // input data

            for (int n = 0;n < N;n++) {
                Point nowCow = cowPoint[n];
                findClosedPair(nowCow);
            }

            sb.append(MIN).append(" ").append(COUNT);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void findClosedPair(Point cow) {
        int start = 0, end = M - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            Point horse = horsePoint[mid];

            if (cow.z == horse.z) {
                end = mid;
                break;
            }

            if (cow.z > horse.z) start = mid + 1;
            else end = mid - 1;
        }

        for (int idx = end - 1; idx <= end + 1;idx++) {
            if (idx < 0) continue;
            if (idx >= M) continue;

            int length = getDist(horsePoint[idx], cow);

            if (length < MIN) {
                MIN = length;
                COUNT = 1;
            } else if (length == MIN) {
                COUNT++;
            }
        }
    }

    public static int getDist(Point p1, Point p2) {
        return Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y) + Math.abs(p2.z - p1.z);
    }

    public static void settingInput(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        cowRow = Integer.parseInt(st.nextToken());
        horseRow = Integer.parseInt(st.nextToken());

        COUNT = 0;
        MIN = Integer.MAX_VALUE;
        cowPoint = new Point[N];
        horsePoint = new Point[M];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) cowPoint[n] = new Point(cowRow, 0, Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        for (int m = 0;m < M;m++) horsePoint[m] = new Point(horseRow, 0, Integer.parseInt(st.nextToken()));
        Arrays.sort(cowPoint);
        Arrays.sort(horsePoint);
    }
}
