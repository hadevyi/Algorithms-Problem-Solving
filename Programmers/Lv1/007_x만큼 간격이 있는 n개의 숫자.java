import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : x만큼 간격이 있는 n개의 숫자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12954
 *  2. 풀이핵심
 *  - 원하는 횟수만큼 반복하며, 배열 반환하기
 * 3. 풀이후기
 *  - 0번의 값을 초기화 후 n-1의 값과 더하는 방식으로 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(2, 5))); // [2, 4, 6, 8, 10]
        System.out.println(Arrays.toString(solution(4, 3))); // [4, 8, 12]
        System.out.println(Arrays.toString(solution(-4, 2))); // [-4, -8]
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        int idx = 1;

        while (idx < n)
            answer[idx] = answer[idx++ - 1] + x;

        return answer;
    }
}
