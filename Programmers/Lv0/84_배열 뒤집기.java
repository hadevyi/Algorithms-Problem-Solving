import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 뒤집기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120821
 *  2. 풀이핵심
 *  - 입력하고자 하는 배열의 idx 조절
 * 3. 풀이후기
 *  - 하나는 증가를 하나는 감소를 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}))); // [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(solution(new int[] {1, 1, 1, 1, 1, 2}))); // [2, 1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(solution(new int[] {1, 0, 1, 1, 1, 3, 5}))); // [5, 3, 1, 1, 1, 0, 1]
    }

    public static int[] solution(int[] num_list) {
        int N = num_list.length, idx = 0;
        int[] answer = new int[N];
        for (int n = N - 1;n >= 0;n--)
            answer[idx++] = num_list[n];
        return answer;
    }
}
