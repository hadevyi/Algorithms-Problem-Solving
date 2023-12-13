import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가위 바위 보
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120839
 *  2. 풀이핵심
 *  - 부합하는 결과 출력
 * 3. 풀이후기
 *  - 각 조건에 부합하는 map을 생성해 출력
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("2")); //0
        System.out.println(solution("205")); // 052
    }

    public static Map<String, String> rspMap = new HashMap<>() {{
       put("0", "5");
       put("2", "0");
       put("5", "2");
    }};
    public static String solution(String rsp) {
        // 가위(2), 바위(0), 보(5)
        StringBuffer sb = new StringBuffer();
        int N = rsp.length();

        for (int n = 0;n < N;n++)
            sb.append(rspMap.get(Character.toString(rsp.charAt(n))));

        return sb.toString();
    }
}
