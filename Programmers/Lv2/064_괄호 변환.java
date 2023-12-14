import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 괄호 변환
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/60058
 *  2. 풀이핵심
 *  - stack을 활용한 괄호 확인, 투포인터를 활용한 구간 확인, 문자열 분환
 * 3. 풀이후기
 *  - 다양한 내용을 한번에 활용해야하는 문제였음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("(()())()")); // (()())()
        System.out.println(solution(")(")); // ()
        System.out.println(solution("()))((()")); // ()(())()
    }

    public static String solution(String p) {
        if (p.length() == 0) return p;
        if (isPair(p)) return p;

        StringBuffer sb = new StringBuffer();
        int[] points = findPair(p);

        String u = p.substring(points[0], points[1]); // 균형잡힌 괄호
        String v = ""; // 남은 내용
        if (points[0] == 0 && points[1] < p.length()) v = p.substring(points[1]);
        else if (points[1] == p.length() && points[0] > 0) v = p.substring(0, points[0] - 1);

        if (isPair(u)) {
            sb.append(u);
            sb.append(solution(v));
        } else {
            sb.append('(');
            sb.append(solution(v));
            sb.append(')');
            sb.append(newU(u));
        }
        return sb.toString();
    }

    public static String newU(String u) {
        if (u.length() <= 2) return "";
        u = u.substring(1, u.length() - 1);
        StringBuffer sb = new StringBuffer();
        for (char ch : u.toCharArray())
            if (ch == '(') sb.append(')');
            else sb.append('(');
        return sb.toString();
    }

    public static boolean isPair(String p) {
        // 올바른 괄호 확인
        Stack<Character> stack = new Stack<>();
        int N = p.length();

        for (int n = 0;n < N;n++) {
            char ch = p.charAt(n);

            if (!stack.isEmpty() && stack.peek() == '(' && ch == ')') stack.pop();
            else stack.push(ch);
        }

        return stack.isEmpty();
    }

    public static int[] findPair(String p) {
        // 균형잡힌 괄호 문자열 확인
        // 단, 2조각이여야 함으로 start, n 혹은 n, end
        int start = 0, end = 0, N = p.length();
        int leftCount = 0, rightCount = 0;

        while (true) {
            if (leftCount > 0 && leftCount == rightCount) break;
            if (end < N) {
                if (p.charAt(end++) == '(') leftCount++;
                else rightCount++;
            } else if (end == N) {
                if (p.charAt(start++) == '(') leftCount--;
                else rightCount--;
            }
        }

        return new int[] {start, end};
    }
}
