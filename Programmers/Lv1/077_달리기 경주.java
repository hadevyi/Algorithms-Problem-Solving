import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 달리기 경주
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/178871
 *  2. 풀이핵심
 *  - 시간을 줄이는 것이 핵심
 * 3. 풀이후기
 *  - map으로 index 값을 빠르게 확인하며, array에 변경된 값을 기록하는 방식
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"mumu", "soe", "poe", "kai", "mine"},
                new String[] {"kai", "kai", "mine", "mine"}))); // ["mumu", "kai", "mine", "soe", "poe"]
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int n = 0;n < players.length;n++)
            map.put(players[n], n);

        for (String calling : callings) {
            int idx = map.get(calling);
            map.put(calling, idx - 1);
            map.put(players[idx - 1], map.get(players[idx - 1]) + 1);

            players[idx] = players[idx - 1];
            players[idx - 1] = calling;
        }

        return players;
    }
}
