import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 캐릭터의 좌표
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120861
 *  2. 풀이핵심
 *  - 값의 범위를 확인하며 진행
 * 3. 풀이후기
 *  - 각 board의 가로, 세로의 크기가 홀수이기에 추가적인 단계를 진행하지 않고 범위를 확인할 수 있었음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"left", "right", "up", "right", "right"}, new int[] {11, 11} ))); // [2, 1]
        System.out.println(Arrays.toString(solution(new String[] {"down", "down", "down", "down", "down"}, new int[] {7, 9} ))); // [0, -4]
    }

    public static int[] solution(String[] keyinput, int[] board) {
        // 0 <= keyinput.length <= 50
        // 1 <= board[0], board[1] <= 99

        int dataGapI = board[0] / 2, dataGapJ = board[1] / 2;
        int i = 0, j = 0, N = keyinput.length;

        for (int n = 0;n < N;n++) {
            String str = keyinput[n];

            switch (str) {
                case "up": if (isAear(j + 1, dataGapJ)) j++; break;
                case "down" : if (isAear(j - 1, dataGapJ)) j--; break;
                case "left" : if (isAear(i -1, dataGapI)) i--; break;
                case "right" : if (isAear(i + 1, dataGapI)) i++; break;
            }
        }

        return new int[] {i, j };
    }

    public static boolean isAear(int n, int maxN) {
        return Math.abs(n) <= maxN;
    }
}
