import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 줄 서는 방법
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12936
 *  2. 풀이핵심
 *  - 순열의 특징을 반복하며 구현하기
 * 3. 풀이후기
 *  - 직접 바로 찾는 방법을 사용해야하며, 반복되는 구간만 확인한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 5)); // [3, 1, 2]
        System.out.println(solution(1, 1)); // [1]
        System.out.println(solution(2, 2)); // [2, 1]
        System.out.println(solution(4, 5)); // [1, 4, 2, 3]
    }

    public static long factorial;
    public static ArrayList<Integer> list;
    public static int[] solution(int n, long k) {
        int[] answer = new int[n];
        setting(n);
        int idx = 0;
        k--;

        while (n > 0) {
            factorial = factorial / n--;    // 가장 앞의 반복되는 갯수를 확인하기
            int m = (int)(k / factorial);   // 지울 번째를 찾음
            answer[idx++] = list.remove(m); // 지우면서 순서대로 넣기
            k %= factorial;                 // 중복되는 구간만큼만 확인하게 조정함
        }

        return answer;
    }

    public static void setting(int n) {
        // 팩토리얼 초기화
        factorial = 1;
        for (int i = 2;i <= n;i++)
            factorial = factorial * i;

        // 리스트 초기화
        list = new ArrayList<>();
        for (int i = 1;i <= n;i++) list.add(i);
    }
}
