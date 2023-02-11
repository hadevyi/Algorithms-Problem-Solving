import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 컨트롤 제트
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120853
 *  2. 풀이핵심
 *  - Z가 나오면 바로 다음 이전 값을 삭제한다. 이는 FILO되는 stack을 활용했다.
 * 3. 풀이후기
 *  - 진행은 간단했다. import를 자꾸 잊어서 IDE에서 오류가 나는 것만 더 신경써야겠다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("1 2 Z 3")); // 4
        System.out.println(solution("10 20 30 40")); // 100
        System.out.println(solution("10 Z 20 Z 1")); // 1
        System.out.println(solution("10 Z 20 Z")); // 0
        System.out.println(solution("-1 -2 -3 Z")); // -3
    }

    public static int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        Stack<Integer> stack = new Stack<>();
        int N = st.countTokens();

        for (int n = 0;n < N;n++) {
            String str = st.nextToken();
            if (str.equals("Z")) stack.pop();
            else stack.push(Integer.parseInt(str));
        }

        int answer = 0;
        while (!stack.isEmpty())
            answer += stack.pop();
        return answer;
    }
}
