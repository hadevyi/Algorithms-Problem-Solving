/**
 * 1. 문제정보
 *  - 제목 : 소수 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12977
 *  2. 풀이핵심
 *  - 주어진 숫자 중 3가지를 조합하고, 그 합이 소수인지 확인
 * 3. 풀이후기
 *  - 조합하는 과정을 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1,2,3,4})); // 1
        System.out.println(solution(new int[] {1,2,7,6,4})); // 4
    }

    public static int answer, N = 3;
    public static int[] target;
    public static int solution(int[] nums) {
        answer = 0;
        target = new int[N];
        combine(0, 0, nums);
        return answer;
    }

    public static void combine(int srcIdx, int tagIdx, int[] nums) {
        if (tagIdx == N) {
            int sum = 0;
            for (int tgt : target) sum += tgt;
            if (isPrime(sum))
                answer++;
            return;
        }

        for (int i = srcIdx;i < nums.length;i++) {
            target[tagIdx] = nums[i];
            combine(i + 1, tagIdx + 1, nums);
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2;i < number;i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
