import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 창고 다각형
 *  - 번호 : 2304
 *  - 링크 : https://www.acmicpc.net/problem/2304
 *  2. 풀이핵심
 *  - Top을 기준으로 양옆을 나눠서 진행하는 방식이 핵심이였다.
 * 3. 풀이후기
 *  - 분류는 Stack이지만, 구현으로 가능한 문제였다.
 *  - 생각치 못한 부분은 양 끝의 기둥이 Max일 때를 생각하기 위해서는 가장 처음 maxPoints를 정리할 때 조정이 필요했다.
 */
public class Main {

    public static int Result;
    public static ArrayList<Point> maxPoints;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        maxPoints = new ArrayList<Point>();
        int maxValue = 0;

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[n] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            maxValue = Integer.max(maxValue, points[n].H);
        }

        Arrays.sort(points);

        for (int n = 0;n < N;n++) {
            if (points[n].H == maxValue) {
                maxPoints.add(points[n]);
            }
        }

        // Top 값 먼저 계산
        Result = maxPoints.size() == 1 ? maxValue : (maxPoints.get(maxPoints.size() - 1).L - maxPoints.get(0).L + 1) * maxValue;

        // left 값 계산
        int nowL = points[0].L, nowH = points[0].H;
        for (int n = 0;n < N;n++) {
            if (points[n].H == maxValue) {
                Result += (points[n].L - nowL) * nowH;
                break;
            } else if (nowH < points[n].H) {
                Result += (points[n].L - nowL) * nowH;
                nowL = points[n].L;
                nowH = points[n].H;
            }
        }

        // right 값 계산
        nowL = points[N - 1].L;
        nowH = points[N - 1].H;
        for (int n = N - 1;n >= 0;n--) {
            if (points[n].H == maxValue) {
                Result += (nowL - points[n].L) * nowH;
                break;
            } else if (nowH < points[n].H) {
                Result += (nowL - points[n].L) * nowH;
                nowL = points[n].L;
                nowH = points[n].H;
            }
        }

        System.out.println(Result);
    }

    public static class Point implements Comparable<Point> {
        public int L;
        public int H;

        public Point(int L, int H) {
            this.L = L;
            this.H = H;
        }

        @Override
        public int compareTo(Point o) {
            return this.L - o.L;
        }
    }
}
