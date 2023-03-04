/**
 * 1. 문제정보
 *  - 제목 : 약수의 개수와 덧셈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77884
 *  2. 풀이핵심
 *  - 약수의 개수 세기
 * 3. 풀이후기
 *  - 약수의 개수가 짝홀에 따라 결과가 달라짐에 유의
 *  - left, right에 들어올 수 있는 범위가 1부터 시작이기에, count 기본값을 확인해야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(13, 17)); // 43
        System.out.println(solution(24, 27)); // 52
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int num = left;num <= right;num++) {
            int count = 1; // 1은 항상 포함
            for (int n = 2;n <= num;n++)
                if (num % n == 0)
                    count++;
            answer += count % 2 == 0 ? num : (-1) * num;
        }

        return answer;
    }
}
