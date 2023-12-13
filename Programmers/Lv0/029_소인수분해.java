import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소인수분해
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120852
 *  2. 풀이핵심
 *  - 소인수분해한 결과를 중복없이 출력함
 * 3. 풀이후기
 *  - 소인수를 분해하는 것은 간단한 로직이지만, 수가 커질 수록 시간이 더 걸릴 것으로 생각됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(12))); // [2, 3]
        System.out.println(Arrays.toString(solution(17))); // [17]
        System.out.println(Arrays.toString(solution(420))); // [2, 3, 5, 7]
    }

    public static int[] solution(int n) {
        boolean[] isExist = new boolean[n + 1]; // 0 dummy
        int data = n, N = 0;

        for (int i = 2;i <= data;i++) {
            while (data % i == 0) {
                data /= i;
                if (!isExist[i]) N++;
                isExist[i] = true;
            }
        }

        int[] answer = new int[N];
        int idx = 0;
        for (int i = 0;i < n + 1;i++)
            if (isExist[i])
                answer[idx++] = i;
        return answer;
    }
}
