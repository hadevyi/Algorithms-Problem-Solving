import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 마법의 엘리베이터
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/148653
 *  2. 풀이핵심
 *  - 어떨 때, 올라가고 내려가고가 이득인지 확인해야함
 * 3. 풀이후기
 *  - 1~4, 6~9의 값은 명확했으나, 5가 기준점이였다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(16)); // 6
        System.out.println(solution(2554)); // 16
    }

    // 1 2 3 4 5 6 7 8 9
    // 1 2 3 4 5 4 3 2 1
    public static int solution(int storey) {
        String str = Integer.toString(storey);
        int N = str.length();
        int[] arr = new int[N + 1];
        for (int n = 1;n <= N;n++)
            arr[n] = str.charAt(n - 1) - '0';

        int answer = 0;
        for (int n = N;n > 0;n--) {
            int value = arr[n];
            if (value < 5 || (value == 5 && arr[n - 1] < 5))
                answer += value;
            else {
                answer += 10 - value;
                arr[n - 1]++;
            }
        }
        if (arr[0] > 5) answer += 10 - arr[0];
        else answer += arr[0];
        return answer;
    }
}
