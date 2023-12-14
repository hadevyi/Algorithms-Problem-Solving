import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최솟값 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12941
 *  2. 풀이핵심
 *  - 곱을 통해서 가장 작은 값을 만들려면 결과들이 작게 나와야함
 * 3. 풀이후기
 *  - 정렬해서 반대 방향 순으로 곱해 결과를 합산함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 4, 2}, new int[] {5, 4, 4})); // 29
        System.out.println(solution(new int[] {1, 2}, new int[] {3, 4})); // 10
    }

    public static int solution(int []A, int []B)
    {
        int answer = 0, N = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int n = 0;n < N;n++)
            answer += A[n] * B[N - (n + 1)];

        return answer;
    }
}