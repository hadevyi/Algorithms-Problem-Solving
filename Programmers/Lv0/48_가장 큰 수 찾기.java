import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 큰 수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120899
 *  2. 풀이핵심
 *  - 대소확인
 * 3. 풀이후기
 *  - 최대의 값과 index 값을 반환해야하는데 최대/소값을 보냈었다.. 문제를 자세히 읽자 ㅠ
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 8, 3}))); // [8, 1]
        System.out.println(Arrays.toString(solution(new int[] {9, 10, 11, 8}))); // [11, 2]
    }

    public static int[] solution(int[] array) {
        int maxValue = Integer.MIN_VALUE, maxIdx = 0;
        int N = array.length;

        for (int n = 0;n < N;n++) {
            if (maxValue < array[n]) {
                maxValue = array[n];
                maxIdx = n;
            }
        }

        int[] answer = {maxValue, maxIdx};
        return answer;
    }
}
