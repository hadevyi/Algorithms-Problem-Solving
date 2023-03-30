import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝지어 제거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12973
 *  2. 풀이핵심
 *  - 앞을 꺼내서 뒤랑 비교하기에 Deque를 활용함
 * 3. 풀이후기
 *  - peek의 조건을 확인하며 진행하는 것을 잊지말자
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution("baabaa")); // 1
        System.out.println(solution("cdcd")); // 0
    }

    public static int solution(String s) {
        Deque<Character> deque = new LinkedList<>();
        deque.addLast(s.charAt(0));
        for (int i = 1;i < s.length();i++) {
            if (!deque.isEmpty() && deque.peekLast() == s.charAt(i)) deque.pollLast();
            else deque.addLast(s.charAt(i));
        }
        int nowLength = 0;
        while(true) {
            nowLength = deque.size();
            for (int i = 0;i < nowLength;i++) {
                Character now = deque.pollFirst();
                if (deque.peekLast() == now) deque.pollLast();
                else deque.addLast(now);
            }
            if (nowLength == deque.size() || deque.isEmpty()) break;
        }
        return deque.isEmpty() ? 1 : 0;
    }
}
