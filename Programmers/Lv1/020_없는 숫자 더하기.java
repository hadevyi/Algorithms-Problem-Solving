/**
 * 1. 문제정보
 *  - 제목 : 없는 숫자 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86051
 *  2. 풀이핵심
 *  - 배열 내 존재 유무를 확인하는 함수를 만들어서 진행
 * 3. 풀이후기
 *  - 간단한 구현 과정
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0})); // 14
        System.out.println(solution(new int[] {5, 8, 4, 0, 6, 7, 9})); // 6
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0;i <= 9;i++) {
            if (!isExist(numbers, i))
                answer += i;
        }

        return answer;
    }

    public static boolean isExist(int[] numbers, int num) {
        for (int data : numbers)
            if (data == num)
                return true;
        return false;
    }
}
