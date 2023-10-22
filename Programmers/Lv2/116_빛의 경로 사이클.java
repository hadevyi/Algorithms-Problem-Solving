import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 빛의 경로 사이클
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86052
 *  2. 풀이핵심
 *  - 방문처리 및 재귀함수
 * 3. 풀이후기
 *  - 재귀함수로 풀었더니 런타임에러가 났다. 자세히 나오지 않아 확인하니, Stack Over Flow이다.
 *  - 같은 로직이지만 재귀함수가 아닌 while로 구성해보았다. 이런 부분에 대한 경계치를 잘 확인해야겠다.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"SL","LR"} )));   // [16]
        System.out.println(Arrays.toString(solution(new String[] {"S"} )));         // [1, 1, 1, 1]
        System.out.println(Arrays.toString(solution(new String[] {"R", "R"} )));    // [4, 4]
        System.out.println(Arrays.toString(solution(new String[] {"S", "S"})));     // [1, 1, 1, 1, 2, 2]
    }

    public static int N, M, D = 4;
    public static char[][] MAP;
    public static boolean[][][] isVisited;
    public static int[][] DELTA = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public static int[] solution(String[] grid) {
        N = grid.length;
        M = grid[0].length();
        MAP = new char[N][M];
        isVisited = new boolean[N][M][D];

        for (int n = 0;n < N;n++)
            MAP[n] = grid[n].toCharArray();

        List<Integer> list = new ArrayList<>();

        for (int n = 0;n < N;n++)
            for (int m = 0;m < M;m++)
                for (int d = 0;d < D;d++) {
                    if (isVisited[n][m][d]) continue;
                    list.add(getLightLength(n, m, d));
                }

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0;i < list.size();i++)
            answer[i] = list.get(i);
        return answer;
    }

    public static int getLightLength(int x, int y, int d) {
        int result = 0;

        while (!isVisited[x][y][d]) {
            isVisited[x][y][d] = true;
            d = getNextDirection(MAP[x][y], d);
            int[] nextPoint = getSPoint(x, y, d);
            x = nextPoint[0];
            y = nextPoint[1];
            result++;
        }

        return result;
    }

    public static int getNextDirection(char ch, int d) {
        if (ch == 'S') return d;

        int nd = d;
        if (ch == 'L') nd--;
        else nd++;

        nd = nd == -1 ? D - 1 : nd;
        nd = nd == D ? 0 : nd;
        return nd;
    }

    public static int[] getSPoint(int x, int y, int d) {
        int nx = x + DELTA[d][0];
        int ny = y + DELTA[d][1];
        nx = nx == -1 ? N - 1 : nx;
        ny = ny == -1 ? M - 1 : ny;
        nx = nx == N ? 0 : nx;
        ny = ny == M ? 0 : ny;
        return new int[] { nx, ny };
    }
}
