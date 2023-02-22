import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 자르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120833
 *  2. 풀이핵심
 *  - 정해진 부분을 반환하기
 * 3. 풀이후기
 *  - 간단한 인덱스 진행으로 확인
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}, 1, 3))); // [2, 3, 4]
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5}, 1, 2))); // [3, 5]
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int N = num2 - num1 + 1, idx = 0;
        int[] answer = new int[N];
        for (int i = num1;i <= num2;i++)
            answer[idx++] = numbers[i];
        return answer;
    }
}
