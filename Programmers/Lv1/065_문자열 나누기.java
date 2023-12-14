import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 나누기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/140108
 *  2. 풀이핵심
 *  - 기준이 되는 문자가 계속 갱신됨
 * 3. 풀이후기
 *  - 단순 기준과 같은지 확인하고 추가해 길이로 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("banana")); // 3
        System.out.println(solution("abracadabra")); // 6
        System.out.println(solution("aaabbaccccabba")); // 3
    }

    static Map<String, ArrayList<Character>> map;
    public static int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        resetMap();

        for (int i = 0;i < s.length();i++) {
            char now = s.charAt(i);
            map.get(x == now ? "O" : "X").add(now);

            if (map.get("O").size() == map.get("X").size()) {
                resetMap();
                answer++;
                if (i < s.length() - 1)
                    x = s.charAt(i + 1);
            }
        }

        if (!map.get("O").isEmpty() || !map.get("X").isEmpty()) answer++;
        return answer;
    }

    public static void resetMap() {
        map = new HashMap<>();
        map.put("O", new ArrayList<>());
        map.put("X", new ArrayList<>());
    }
}
