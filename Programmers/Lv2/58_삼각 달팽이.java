import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 삼각 달팽이
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68645
 *  2. 풀이핵심
 *  - 조건에 맞게 단계를 진행하기
 * 3. 풀이후기
 *  - 달팽이 그림 그리기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(4)));
        // [1,2,9,3,10,8,4,5,6,7]
        System.out.println(Arrays.toString(solution(5)));
        // [1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
        System.out.println(Arrays.toString(solution(6)));
        // [1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
    }

    public static ArrayList<Integer> arrayList;
    public static int[] solution(int n) {
        int[][] map = new int[n][n];
        arrayList = new ArrayList<>();
        int num = 1, REAP = n, i = -1, j = 0;

        while (true) {
            for (int reap = 0;reap < REAP;reap++)
                map[++i][j] = num++;

            if (REAP <= 0) break;
            REAP--;

            for (int reap = 0;reap < REAP;reap++)
                map[i][++j] = num++;

            if (REAP <= 0) break;
            REAP--;

            for (int reap = 0;reap < REAP;reap++)
                map[--i][--j] = num++;

            if (REAP <= 0) break;
            REAP--;
        }

        for (int[] m : map)
            for (int data : m)
                if (data > 0)
                    arrayList.add(data);

        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}
