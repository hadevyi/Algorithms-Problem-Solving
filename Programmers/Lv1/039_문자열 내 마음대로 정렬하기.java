import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 내 마음대로 정렬하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12915
 *  2. 풀이핵심
 *  - 문자열 비교하기
 * 3. 풀이후기
 *  - 해당 인덱스 문자가 같은 경우, 사전순으로 배치함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"sun", "bed", "car"}, 1))); // ["car", "bed", "sun"]
        System.out.println(Arrays.toString(solution(new String[] {"abce", "abcd", "cdx"}, 2))); // ["abcd", "abce", "cdx"]
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }
}
