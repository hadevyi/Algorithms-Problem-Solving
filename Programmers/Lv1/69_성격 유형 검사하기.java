import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 성격 유형 검사하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/118666
 *  2. 풀이핵심
 *  - 기본 데이터를 잘 정리하는 것이 중요했음
 * 3. 풀이후기
 *  - 처음이 복잡하지만, 정돈한다면 첫 시도만에 가능
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5})); // TCMA
        System.out.println(solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3})); // RCJA
    }

    static Map<Character, Integer> maps;
    static Map<Integer, Integer> scores;
    static String[] types = {"RT", "CF", "JM", "AN"};
    public static String solution(String[] survey, int[] choices) {
        resetData();
        int N = survey.length;

        for (int n = 0;n < N;n++) {
            int choice = choices[n];
            String survey_each = survey[n];

            if (choice == 4) continue;

            if (choice < 4) maps.put(survey_each.charAt(0), maps.get(survey_each.charAt(0)) + scores.get(choice));
            else maps.put(survey_each.charAt(1), maps.get(survey_each.charAt(1)) + scores.get(choice));
        }

        // 결과 확인
        StringBuffer sb = new StringBuffer();
        for (String type : types) {
            if (maps.get(type.charAt(0)) < maps.get(type.charAt(1))) sb.append(type.charAt(1));
            else sb.append(type.charAt(0));

        }
        return sb.toString();
    }

    public static void resetData() {
        maps = new HashMap<>() {{ put('R', 0); put('T', 0);
            put('C', 0); put('F', 0);
            put('J', 0); put('M', 0);
            put('A', 0); put('N', 0);
        }};

        scores = new HashMap<>() {{
            put(1, 3); put(2, 2); put(3, 1);
            put(5, 1); put(6, 2); put(7, 3);
        }};
    }
}
