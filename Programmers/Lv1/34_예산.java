import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 예산
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12982
 *  2. 풀이핵심
 *  - 최대한 많은 부서를 지원하기 위해서는 금액이 적은 부서부터 지원해야함
 * 3. 풀이후기
 *  - 정렬 후 예산이 넘는 직전의 갯수를 반환하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 3, 2, 5, 4}, 9)); // 3
        System.out.println(solution(new int[] {2, 2, 3, 3}, 10)); // 4
    }
    public static int solution(int[] d, int budget) {
        int sum = 0;
        Arrays.sort(d);

        for (int i = 0;i < d.length;i++) {
            if (sum + d[i] > budget) return i;
            sum += d[i];
        }

        return d.length;
    }
}
