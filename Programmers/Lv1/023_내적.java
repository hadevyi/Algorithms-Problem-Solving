/**
 * 1. 문제정보
 *  - 제목 : 내적
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/70128
 *  2. 풀이핵심
 *  - 모든 배열의 길이를 계산하기
 * 3. 풀이후기
 *  - 길이만 확인하면 반복문으로 쉽게 구현하는 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4}, new int[] {-3, -1, 0, 2})); // 3
        System.out.println(solution(new int[] {-1, 0, 1}, new int[] {1, 0, -1})); // -2
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0, N = a.length;
        for (int n = 0;n < N;n++)
            answer += a[n] * b[n];
        return answer;
    }
}
