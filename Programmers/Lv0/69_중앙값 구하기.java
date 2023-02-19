import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 중앙값 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120811
 *  2. 풀이핵심
 *  - 원소 정렬하기
 * 3. 풀이후기
 *  - 중앙에 위치한 값을 출력해야 하고, 배열의 길이가 홀수이기에 확실함 과정임
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 7, 10, 11})); // 7
        System.out.println(solution(new int[] {9, -1, 0})); // 0
    }

    public static int solution(int[] array) {
        int N = array.length;
        Arrays.sort(array);
        return array[N/2];
    }
}
