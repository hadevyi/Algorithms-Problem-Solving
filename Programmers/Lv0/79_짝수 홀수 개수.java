import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝수 홀수 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120824
 *  2. 풀이핵심
 *  - 짝홀수 세기
 * 3. 풀이후기
 *  - 순서대로 확인하며, 짝수과 홀수의 셈을 할지 확인하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}))); // [2, 3]
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5, 7}))); // [0, 0]
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        int N = num_list.length;
        for (int n = 0;n < N;n++)
            answer[num_list[n] % 2 == 0 ? 0 : 1]++;
        return answer;
    }
}
