import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 삼각형의 완성조건 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120889
 *  2. 풀이핵심
 *  - 다양한 삼각형의 조건을 확인하기
 * 3. 풀이후기
 *  - 가장 긴 변이 여러개일 수 있음을 감안해 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3})); // 2
        System.out.println(solution(new int[] {3, 6, 2})); // 2
        System.out.println(solution(new int[] {199, 72, 222})); // 1
        System.out.println(solution(new int[] {3, 3, 2})); // 1
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        if (sides[0] < sides[1] && sides[1] == sides[2]) return 1;
        if (sides[0] == sides[1] && sides[1] == sides[2]) return 1;
        if (sides[0] + sides[1] > sides[2]) return 1;
        return 2;
    }
}
