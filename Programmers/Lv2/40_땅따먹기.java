/**
 * 1. 문제정보
 *  - 제목 : 땅따먹기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12913
 *  2. 풀이핵심
 *  - 직접 구현했다가 시간초과가 발생하였다.
 * 3. 풀이후기
 *  - 입력의 범위가 넓다고 생각해 DP로 추가 풀이 하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{1,2,3,5}, {5,6,7,8},{4,3,2,1}}));
    }

    static int solution(int[][] land) {
        for (int row = 1;row < land.length;row++) {
            for (int col = 0; col < 4;col++) {
                int MAX = 0;
                for (int c = 0;c < 4;c++) {
                    if (col == c) continue;
                    MAX = Math.max(MAX, land[row - 1][c]);
                }
                land[row][col] += MAX;
            }
        }

        int answer = 0;
        for (int data : land[land.length - 1])
            answer = Math.max(data, answer);
        return answer;
    }
}
