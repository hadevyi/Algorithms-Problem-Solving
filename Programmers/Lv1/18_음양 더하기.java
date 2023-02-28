/**
 * 1. 문제정보
 *  - 제목 : 음양 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/76501
 *  2. 풀이핵심
 *  - boolean 값을 확인해서 진행
 * 3. 풀이후기
 *  - 간단한 반복문과 삼항 연산자로 해결함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {4, 7, 12}, new boolean[] {true, false, true})); // 9
        System.out.println(solution(new int[] {1, 2, 3}, new boolean[] {false, false, true})); // 0

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0, N = absolutes.length;

        for (int n = 0;n < N;n++)
            answer += signs[n] ? absolutes[n] : absolutes[n] * -1;

        return answer;
    }
}
