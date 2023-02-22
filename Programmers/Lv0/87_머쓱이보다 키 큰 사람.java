/**
 * 1. 문제정보
 *  - 제목 : 머쓱이보다 키 큰 사람
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120585
 *  2. 풀이핵심
 *  - 기준보다 큰 값 찾기
 * 3. 풀이후기
 *  - 배열의 원소를 확인하며 진행
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {149, 180, 192, 170}, 167)); // 3
        System.out.println(solution(new int[] {180, 120, 140}, 190)); // 0
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int a : array)
            if (a > height)
                answer++;
        return answer;
    }
}
