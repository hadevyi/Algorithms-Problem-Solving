/**
 * 1. 문제정보
 *  - 제목 : 중복된 숫자 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120583
 *  2. 풀이핵심
 *  - 같은 원소의 개수 반환하기
 * 3. 풀이후기
 *  - 반복문을 순회하며 확인
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 1, 2, 3, 4, 5}, 1)); // 2
        System.out.println(solution(new int[] {0, 2, 3, 4}, 1)); // 0
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int a : array)
            if (a == n)
                answer++;
        return answer;
    }
}
