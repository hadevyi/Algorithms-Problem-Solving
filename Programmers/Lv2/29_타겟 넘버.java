/**
 * 1. 문제정보
 *  - 제목 : 타겟 넘버
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/43165
 *  2. 풀이핵심
 *  - 순서가 바뀌지 않음에 확인
 * 3. 풀이후기
 *  - 순서가 바뀌지 않아 정해져있으므로, 양/음수만 바꿔서 진행하였음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        // 숫자 20개 이하
        System.out.println(solution(new int[] {1, 1, 1, 1, 1}, 3)); // 5
        System.out.println(solution(new int[] {4, 1, 2, 1}, 4)); // 2
    }

    public static int COUNT;
    public static int solution(int[] numbers, int target) {
        COUNT = 0;
        checkNumberSum(0, 0, numbers, target);
        return COUNT;
    }

    public static void checkNumberSum(int idx, int total, int[] numbers, int target) {
        if (idx == numbers.length) {
            if (total == target)
                COUNT++;
            return;
        }

        checkNumberSum(idx + 1, total + (-1) * numbers[idx], numbers, target);
        checkNumberSum(idx + 1, total + numbers[idx], numbers, target);
    }
}
