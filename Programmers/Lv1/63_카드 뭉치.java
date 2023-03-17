import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 카드 뭉치
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/159994
 *  2. 풀이핵심
 *  - 각각의 검사 위치만 보면 된다. 따라서 Queue를 이용하는 것이 적합하다고 판단함
 * 3. 풀이후기
 *  - 확인 조건에 끝까지 다 확인한 경우(idx == goal.length)와 최상단 모두 목표가 아닌 경우를 함께 써야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"i", "drink", "water"}, new String[] {"want", "to"}, new String[] {"i", "want", "to", "drink", "water"})); // "Yes"
        System.out.println(solution(new String[] {"i", "water", "drink"}, new String[] {"want", "to"}, new String[] {"i", "want", "to", "drink", "water"})); // "No"
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean collect = true;
        Queue<String> cardOne = new LinkedList<>();
        Queue<String> cardTwo = new LinkedList<>();

        for (int i = 0;i < cards1.length;i++) cardOne.add(cards1[i]);
        for (int i = 0;i < cards2.length;i++) cardTwo.add(cards2[i]);

        int idx = 0;
        while (!(cardOne.isEmpty() && cardTwo.isEmpty()) && idx < goal.length) {
            String nowGoal = goal[idx];

            if (!cardOne.isEmpty() && cardOne.peek().equals(nowGoal)) cardOne.poll();
            else if (!cardTwo.isEmpty() && cardTwo.peek().equals(nowGoal)) cardTwo.poll();
            else {
                collect = false;
                break;
            }

            idx++;
        }

        return collect ? "Yes" : "No";
    }
}
