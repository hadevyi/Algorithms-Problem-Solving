import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특이한 정렬
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120880
 *  2. 풀이핵심
 *  - 정렬 기준을 세워 진행함
 * 3. 풀이후기
 *  - Object Array로 하는 방법과 2D Array로 하는 방법을 모두 활용해보았음
 *  - import를 하지 않아서 어이없는 런타임 에러가 발생했음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6}, 4))); // [4, 5, 3, 6, 2, 1]
        System.out.println(Arrays.toString(solution(new int[] {10000, 20, 36, 47, 40, 6, 10, 7000}, 30))); // [36, 40, 20, 47, 10, 6, 7000, 10000]
    }

    public static int[] solution(int[] numlist, int n) {
        int N = numlist.length;
        int[][] values = new int[N][2];

        for (int i = 0;i < N;i++) {
            values[i][0] = numlist[i];
            values[i][1] = n - numlist[i];
        }

        Arrays.sort(values, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (Math.abs(o1[1]) == Math.abs(o2[1]))
                    return o2[0] - o1[0];
                return Math.abs(o1[1]) - Math.abs(o2[1]);
            }
        });

        int[] answer = new int[N];

        for (int i = 0;i < N;i++)
            answer[i] = values[i][0];

        return answer;
    }
}
