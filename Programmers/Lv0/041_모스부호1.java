import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 모스부호(1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120838
 *  2. 풀이핵심
 *  - key와 value를 갖고 있는 map을 활용하였음
 * 3. 풀이후기
 *  - 공백을 기준으로 제공해주어 처리하기엔 쉬웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(".... . .-.. .-.. ---")); // hello
        System.out.println(solution(".--. -.-- - .... --- -.")); // python
    }

    public static Map<String, String> morse = new HashMap<>() {{
        put(".-","a");      put("-...","b");put("-.-.","c");put("-..","d"); put(".","e");   put("..-.","f");
        put("--.","g");     put("....","h");put("..","i");  put(".---","j");put("-.-","k"); put(".-..","l");
        put("--","m");      put("-.","n");  put("---","o"); put(".--.","p");put("--.-","q");put(".-.","r");
        put( "...","s");    put("-","t");   put("..-","u"); put("...-","v");put(".--","w"); put("-..-","x");
        put( "-.--","y");   put("--..","z");
    }};

    public static String solution(String letter) {
        StringTokenizer st = new StringTokenizer(letter);
        int N = st.countTokens();

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            sb.append(morse.get(st.nextToken()));

        return sb.toString();
    }
}
