import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 모음 사전
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/84512
 *  2. 풀이핵심
 *  - AEIOU로 하기엔 어려워 12345로 변경해서 진행함
 * 3. 풀이후기
 *  - 12345로 대치하니 조금 더 쉬운 진행이 되었음. 또한 각 앞자리수로 확인하는 과정에서의 로직만 신청쓰는 것이 중요함
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(solution("AAAAE")); // 6
        System.out.println(solution("AAAE")); // 10
        System.out.println(solution("I")); // 1563
        System.out.println(solution("EIO")); // 1189
    }

    public static Map<String, String> map = new HashMap<>() {{
        put("A", "1"); put("E", "2"); put("I", "3");
        put("O", "4"); put("U", "5");
    }};
    public static int solution(String word) {
        for (String key : map.keySet())
            if (word.contains(key))
                word = word.replace(key, map.get(key));
        Stack<String> stack = new Stack<>();
        stack.add(getNext("Empty"));

        while (true) {
            if (stack.peek().equals(word)) return stack.size();
            String result = getNext(stack.peek());
            if (result.equals("UUUUU")) break;
            stack.add(result);
        }
        return -1;
    }

    public static String getNext(String number) {
        if (number.equals("Empty")) return "1";
        if (number.length() < 5) return number + "1";

        for (int idx = 4;idx >= 0;idx--) {
            String last = number.substring(idx, idx + 1);
            if (!last.equals("5")) last = Integer.toString(Integer.parseInt(last) + 1);
            else continue;
            return number.substring(0, idx) + last;
        }
        return "0";
    }
}
