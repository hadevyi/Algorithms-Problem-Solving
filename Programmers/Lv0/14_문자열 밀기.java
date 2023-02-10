import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 밀기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 *  2. 풀이핵심
 *  - Deque의 특성을 살려서 필요한 method를 구현해 진행함
 * 3. 풀이후기
 *  - 크게 어려운 점은 없었으나 구성에 헷갈렸음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("hello",	"ohell")); // 1
        System.out.println(solution("apple",	"elppa")); // -1
        System.out.println(solution("atat",	"tata")); // 1
        System.out.println(solution("abc",	"abc")); //0
    }

    public static int solution(String A, String B) {
        int N = A.length();

        Deque<String> deque = new LinkedList<>();
        for (int n = 0;n < N;n++)
            deque.add(Character.toString(A.charAt(n)));

        for (int n = 0;n < N;n++) {
            if (getFullString(deque, N).equals(B)) return n;
            deque.addFirst(deque.pollLast());
        }

        return -1;
    }

    public static String getFullString(Deque<String> deque, int N) {
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            String temp = deque.pollFirst();
            sb.append(temp);
            deque.addLast(temp);
        }
        return sb.toString();
    }
}
