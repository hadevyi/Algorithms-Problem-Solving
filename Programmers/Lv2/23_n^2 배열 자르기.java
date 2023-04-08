import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n^2 배열 자르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/87390
 *  2. 풀이핵심
 *  - index로 바로 접근할 수 있는 방법을 찾아서 최소한의 접근하기
 * 3. 풀이후기
 *  - 2D 작업 없이 바로 1D에 값을 넣는 것이 어려웠다. 이후는 범위만큼 반복하면 되서 무난!
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(3, 2, 5))); // [3, 2, 2, 3]
        System.out.println(Arrays.toString(solution(4, 7, 14))); // [4, 3, 3, 3, 4, 4, 4, 4]
    }

    /**
     *                0 1 2   3 4 5  6 7 8
     * 3의 1D Array : 1 2 3 / 2 2 3 / 3 3 3
     *      0       1       2
     * 0    (0, 0)  (0, 1)  (0, 2)
     * 1    (1, 0)  (1, 1)  (1, 2)
     * 2    (2, 0)  (2, 1)  (2, 2)
     * 4의 1D Array : 1 2 3 4 / 2 2 3 4 / 3 3 3 4 / 4 4 4 4
     * */
    public static int[] solution(int n, long left, long right) {
        int idx = 0, N = (int)(right - left + 1);
        int[] result = new int[N];
        for (long num = left;num <= right;num++)
            result[idx++] = Math.max((int)(num / n + 1), (int)(num % n + 1));
        return result;
    }
}
