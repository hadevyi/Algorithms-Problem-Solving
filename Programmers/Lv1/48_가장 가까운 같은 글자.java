import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 가까운 같은 글자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/142086
 *  2. 풀이핵심
 *  - 지금 위치를 기준으로 이전 값들을 확인
 * 3. 풀이후기
 *  - 간단한 구현이라 오히려 당황함..
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("banana"))); // [-1, -1, -1, 2, 2, 2]
        System.out.println(Arrays.toString(solution("foobar"))); // [-1, -1, 1, -1, -1, -1]
    }

    public static int[] solution(String s) {
        int N = s.length();
        int[] answer = new int[N];
        for (int n = 0;n < N;n++)
            answer[n] = checkToSame(n, s);
        return answer;
    }

    public static int checkToSame(int idx, String s) {
        char ch = s.charAt(idx);
        for (int i = idx - 1;i >= 0;i--)
            if (ch == s.charAt(i))
                return idx - i;
        return -1;
    }
}
