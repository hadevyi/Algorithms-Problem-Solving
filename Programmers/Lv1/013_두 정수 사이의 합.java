/**
 * 1. 문제정보
 *  - 제목 : 두 정수 사이의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12912
 *  2. 풀이핵심
 *  - a와 b의 대소가 정해져 있지 않아, 확인해 바꾸기
 * 3. 풀이후기
 *  - 반복문 구현하는 간단한 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 5)); // 12
        System.out.println(solution(3, 3)); // 3
        System.out.println(solution(5, 3)); // 12
    }

    public static long solution(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        long answer = 0;
        for (int i = a;i <= b;i++)
            answer += i;
        return answer;
    }
}
