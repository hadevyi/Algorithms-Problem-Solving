import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최댓값 만들기 (2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120862
 *  2. 풀이핵심
 *  - 최댓값을 확인하기
 * 3. 풀이후기
 *  - 양수간의 곱도 최대지만, 음수간의 곱도 최대가 될 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, -3, 4, -5})); // 15
        System.out.println(solution(new int[] {0, -31, 24, 10, 1, 9})); // 240
        System.out.println(solution(new int[] {10, 20, 30, 5, 5, 20, 5})); // 600
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
        return answer;
    }
}
