/**
 * 1. 문제정보
 *  - 제목 : 배열의 평균값
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120817
 *  2. 풀이핵심
 *  - 합과 개수를 통해 확인하기
 * 3. 풀이후기
 *  - 평균값을 구하는 간단한 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // 5.5
        System.out.println(solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})); // 94.0
    }

    public static double solution(int[] numbers) {
        int N = numbers.length;
        double answer = 0;
        for (int n = 0;n < N;n++)
            answer += numbers[n];
        return answer / N;
    }
}
