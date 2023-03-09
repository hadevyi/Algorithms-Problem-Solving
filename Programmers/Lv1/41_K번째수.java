import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : K번째수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42748
 *  2. 풀이핵심
 *  - 원하는 구간을 자르고 위치를 반환
 * 3. 풀이후기
 *  - n번째가 인덱스와 1 차이가 있었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}))); // [5, 6, 3]
    }

    public static int[] solution(int[] array, int[][] commands) {
        int N = commands.length;
        int[] answer = new int[N];

        for (int n = 0;n < N;n++) {
            int[] command = commands[n];
            int i = command[0] - 1, j = command[1] - 1, k = command[2] - 1;
            int Len = j - i + 1, index = 0;
            int[] temp = new int[Len];

            for (int idx = i;idx <= j;idx++)
                temp[index++] = array[idx];

            Arrays.sort(temp);

            answer[n] = temp[k];
        }

        return answer;
    }
}
