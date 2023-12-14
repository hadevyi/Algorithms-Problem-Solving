/**
 * 1. 문제정보
 *  - 제목 : N개의 최소공배수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12953
 *  2. 풀이핵심
 *  - 유클리드 호제법을 활용해서 진행했다
 * 3. 풀이후기
 *  - GCD와 LCM을 별도로 구현하고 진행하였다
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {2, 6, 8, 14})); // 168
        System.out.println(solution(new int[] {1, 2, 3})); // 6
    }

    public static int solution(int[] arr) {
        if (arr.length == 1) return arr[0];

        int answer = LCM(arr[1], arr[0]);
        for (int i = 2;i < arr.length;i++)
            answer = LCM(arr[i], answer);
        return answer;
    }

    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}
