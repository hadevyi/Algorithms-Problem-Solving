import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최댓값 만들기 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120847
 *  2. 풀이핵심
 *  - 배열에서 나올 수 있는 최댓값을 전달함
 * 3. 풀이후기
 *  - 정렬 후 가장 뒤의 값을 계산함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5})); // 20
        System.out.println(solution(new int[] {0, 31, 24, 10, 1, 9})); // 744
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
