import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 옹알이 (2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133499
 *  2. 풀이핵심
 *  - 옹알이(1)의 조건에 연속되면 안된다는 조건이 하나 더 늘었음
 * 3. 풀이후기
 *  - 숫자로 대치시켜 연속되지 않는 경우에만 카운트하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(new String[] {"aya", "yee", "u", "maa"})); // 1
        System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"})); // 2
    }

    static Map<String, String> defaultBabbling = new HashMap<>() {{
       put("aya", "1"); put("ye", "2"); put("woo", "3"); put("ma", "4");
    }};
    public static int solution(String[] babbling) {
        int N = babbling.length;
        for (int n = 0;n < N;n++)
            for (String data : defaultBabbling.keySet())
                babbling[n] = babbling[n].replace(data, defaultBabbling.get(data));

        int answer = 0;
        for (String babblingEach : babbling)
            if (isAllNum(babblingEach) && isCloseSameNum(babblingEach))
                answer++;
        return answer;
    }

    public static boolean isAllNum(String str) {
        for (char ch : str.toCharArray())
            if (!('0' <= ch && ch <= '9'))
                return false;
        return true;
    }

    public static boolean isCloseSameNum(String str) {
        int N = str.length();
        for (int n = 1;n < N;n++)
            if (str.charAt(n - 1) == str.charAt(n))
                return false;
        return true;
    }
}
