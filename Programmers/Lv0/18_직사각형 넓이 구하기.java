/**
 * 1. 문제정보
 *  - 제목 : 직사각형 넓이 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120860
 *  2. 풀이핵심
 *  - 가로 세로의 좌표를 구할 수 있는 좌표를 확인해야함
 * 3. 풀이후기
 *  - 길이는 절대값을 기준으로 진행하면 됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][] {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

    public static int solution(int[][] dots) {
        return getLength(0, dots[0], dots) * getLength(1, dots[0], dots);
    }

    public static int getLength(int idx, int[] zeroData, int[][] dots) {
        for (int i = 1;i < 4;i++) {
            if (zeroData[idx] == dots[i][idx]) {
                return Math.abs(zeroData[idx == 0 ? 1 : 0] - dots[i][idx == 0 ? 1 : 0]);
            }
        }
        return -1;
    }
}
