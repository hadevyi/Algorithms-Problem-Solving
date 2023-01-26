import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좌표 정렬하기 2
 *  - 번호 : 11651
 *  - 링크 : https://www.acmicpc.net/problem/11651
 *  2. 풀이핵심
 *  - y좌표를 기준으로 정렬하기
 * 3. 풀이후기
 *  - compareTo와 toString을 override하며 간단하게 구현함.
 */
public class Main {

    static int N;
    static Point[] points;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        points = new Point[N];

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[n] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(points);
        for (Point p : points)
            System.out.println(p.toString());
    }

    public static class Point implements Comparable<Point> {
        public int x;
        public int y;

        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return this.x + " " + this.y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.y == o.y)
                return this.x - o.x;
            return this.y - o.y;
        }
    }
}
