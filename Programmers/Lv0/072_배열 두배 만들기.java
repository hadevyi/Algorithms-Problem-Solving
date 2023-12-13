import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 두배 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120809
 *  2. 풀이핵심
 *  - 배열의 원소를 두배로 진행함
 * 3. 풀이후기
 *  - 순서대로 진행해 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}))); // [2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 100, -99, 1, 2, 3}))); // [2, 4, 200, -198, 2, 4, 6]
    }

    public static int[] solution(int[] numbers) {
        int N = numbers.length;
        for (int n = 0;n < N;n++)
            numbers[n] *= 2;
        return numbers;
    }
}
