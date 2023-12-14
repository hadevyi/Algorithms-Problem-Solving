/**
 * 1. 문제정보
 *  - 제목 : N-Queen
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12952
 *  2. 풀이핵심
 *  - 내용을 찾고 조건에 해당하지 않으면 백트레킹
 * 3. 풀이후기
 *  - 백트레킹의 핵심은 결과가 돌아오면, 값을 복원하는 것이다. 그렇기에 복원을 하지 않아 시간이 조금더 사용되었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(4)); // 2
        System.out.println(solution(8)); // 92
    }

    public static int COUNT;
    public static int[][] MAP;
    public static boolean[] isVisited;
    public static int solution(int n) {
        for (int c = 0;c < n;c++) {
            isVisited = new boolean[n];
            MAP = new int[n][n];
            check(0, c);
        }
        return COUNT;
    }

    public static void check(int r, int c) {
        if (isVisited[c]) return; // 같은 열의 값이 이미 체크된 경우, 진행 X
        if (isDiagonal(r, c)) return; // 대각선에 위치하는 경우, 진행 X
        if (r == isVisited.length - 1) {
            COUNT++; return;
        }

        MAP[r][c] = 1;
        isVisited[c] = true;

        for (int i = 0;i < isVisited.length;i++) {
            check(r + 1, i);
        }

        MAP[r][c] = 0;
        isVisited[c] = false;
    }

    public static boolean isDiagonal(int r, int c) {
        // 상단 대각선의 Queen이 있는지 확인하기
        int leftR = r, leftC = c;

        // 왼쪽 상단 대각선으로 확인하기
        while (true) {
            leftR += -1;
            leftC += -1;

            if (leftR < 0 || leftC < 0) break; // 종료 조건
            if (MAP[leftR][leftC] == 1) return true; // Queen이 있음
        }

        int rightR = r, rightC = c;

        // 오른쪽 상단 대각선으로 확인하기
        while (true) {
            rightR += -1;
            rightC += 1;

            if (rightR < 0 || rightC >= MAP.length) break;
            if (MAP[rightR][rightC] == 1) return true;
        }

        return false;
    }
}
