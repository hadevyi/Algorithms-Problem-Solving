import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 크레인 인형뽑기 게임
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/64061
 *  2. 풀이핵심
 *  -
 * 3. 풀이후기
 *  -
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(new int[][] {
                {0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}
        }, new int[] {1,5,3,5,1,2,1,4})); // 4
    }

    public static int solution(int[][] board, int[] moves) {
        // default setting
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        for (int i = 1;i <= board.length;i++)
            map.put(i, new Stack<>());

        Stack<Integer> bucket = new Stack<>();

        // data init
        for (int i = board.length - 1;i >= 0;i--)
            for (int j = 0;j < board[i].length;j++) {
                if (board[i][j] == 0) continue;
                map.get(j + 1).push(board[i][j]);
            }

        // want flow start
        int answer = 0;
        for (int move : moves) {
            if (map.get(move).isEmpty()) continue;

            int each = map.get(move).pop();

            if (!bucket.isEmpty() && bucket.peek() == each) {
                answer += 2;
                bucket.pop();
            } else {
                bucket.push(each);
            }
        }
        return answer;
    }
}
