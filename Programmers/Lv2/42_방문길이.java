import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 방문 길이
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/49994
 *  2. 풀이핵심
 *  - 중복이 없는 경우에만 기록하고, 이 외에는 자리를 이동하며 확인함
 * 3. 풀이후기
 *  - 좌표이동과 함께 영역 밖은 무시함.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("ULURRDLLU")); // 7
        System.out.println(solution("LULLLLLLU")); // 7
    }

    public static int D = 4;
    public static ArrayList<Line> lineList = new ArrayList<>();
    public static int[][] DELTA = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}}; // UDRL 순서

    public static int solution(String dirs) {
        int i = 0, j = 0;
        for (char ch : dirs.toCharArray()) {
            int idx = getIdx(ch);
            int ni = i + DELTA[idx][0];
            int nj = j + DELTA[idx][1];

            if (ni < -5 || ni > 5 || nj < -5 || nj > 5) continue;
            Line newLine = new Line(new Point(i, j), new Point(ni, nj));
            if (!contains(newLine))
                lineList.add(newLine);

            i = ni;
            j = nj;
        }

        return lineList.size();
    }

    public static int getIdx(char ch) {
        if (ch == 'U') return 0;
        else if (ch == 'D') return 1;
        else if (ch == 'R') return 2;
        else if (ch == 'L') return 3;
        return -1;
    }

    public static boolean contains(Line line) {
        for (Line checkLine : lineList) {
            if (
                    (checkLine.startPoint.x == line.startPoint.x
                            && checkLine.startPoint.y == line.startPoint.y
                            && checkLine.endPoint.x == line.endPoint.x
                            && checkLine.endPoint.y == line.endPoint.y)
                            ||
                            (checkLine.startPoint.x == line.endPoint.x
                                    && checkLine.startPoint.y == line.endPoint.y
                                    && checkLine.endPoint.x == line.startPoint.x
                                    && checkLine.endPoint.y == line.startPoint.y)
            )
                return true;
        }
        return false;
    }

    public static class Line {
        Point startPoint;
        Point endPoint;
        public Line(Point startPoint, Point endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }
    }

    public static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
