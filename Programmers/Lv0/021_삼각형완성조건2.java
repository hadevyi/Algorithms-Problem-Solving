/**
 * 1. 문제정보
 *  - 제목 : 삼각형의 완성조건 (2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120868
 *  2. 풀이핵심
 *  - 주어진 조건 이상의 구현 조건을 확인해야함
 * 3. 풀이후기
 *  - 주어진 조건을 구현하는 내용보다는 삼각형의 구성 요건의 수학식을 알고 있어야하는 느낌
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2})); // 1
        System.out.println(solution(new int[] {3, 6})); // 5
        System.out.println(solution(new int[] {11, 7})); // 13
    }

    public static int solution(int[] sides) {
        int bigNum = Math.max(sides[0], sides[1]);
        int smallNum = Math.min(sides[0], sides[1]);

        return (bigNum + smallNum) - (bigNum - smallNum) - 1;
    }
}
