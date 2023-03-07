/**
 * 1. 문제정보
 *  - 제목 : 삼총사
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131705
 *  2. 풀이핵심
 *  - 간단한 조합 구현 문제
 * 3. 풀이후기
 *  - nCr에서 r은 항상 3으로 고정되어있기에 간단하게 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {-2, 3, 0, 2, -5})); // 2
        System.out.println(solution(new int[] {-3, -2, -1, 0, 1, 2, 3})); // 5
        System.out.println(solution(new int[] {-1, 1, -1, 1})); // 0
    }

    public static int CASE, N = 3, Last;
    public static int[] Target;

    public static int solution(int[] number) {
        CASE = 0;
        Target = new int[N];
        Last = number.length;

        combine(number, 0, 0);

        return CASE;
    }

    public static void combine(int[] number, int srcIdx, int tgtIdx) {
        if (tgtIdx == N) {
            int result = 0;
            for (int data : Target)
                result += data;
            if (result == 0) CASE++;
            return;
        }

        for (int i = srcIdx;i < Last;i++) {
            Target[tgtIdx] = number[i];
            combine(number, i + 1, tgtIdx + 1);
        }
    }
}
