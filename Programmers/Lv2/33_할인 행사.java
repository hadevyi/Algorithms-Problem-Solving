import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 할인 행사
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131127
 *  2. 풀이핵심
 *  - 확인해야하는 10일을 잘라서 확인하고, MAP으로 진행함
 * 3. 풀이후기
 *  - MAP에 담겨있지 않는 건 확인할 필요가 없으니, continue를 했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})); // 3
        System.out.println(solution(new String[] {"apple"}, new int[] {10}, new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"})); // 0
    }
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int n = 0;n <= discount.length - 10;n++) {
            Map<String, Integer> map = getMap(want, number);
            String[] days = getArray(n, n + 10, discount);

            for (String day : days) {
                if (!map.containsKey(day)) continue;
                map.put(day, map.get(day) - 1);
            }

            boolean isSignUp = true;
            for (String key : map.keySet())
                if (map.get(key) > 0) {
                    isSignUp = false;
                    break;
                }

            if (isSignUp) answer++;
        }

        return answer;
    }

    public static String[] getArray(int startIdx, int endIdx, String[] discount) {
        int idx = 0;
        String[] result = new String[10];
        for (int i = startIdx;i < endIdx;i++)
            result[idx++] = discount[i];
        return result;
    }

    public static Map<String, Integer> getMap(String[] want, int[] number) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0;i < want.length;i++)
            map.put(want[i], number[i]);
        return map;
    }
}
