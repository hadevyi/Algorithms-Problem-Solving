/**
 * 1. 문제정보
 *  - 제목 : A로 B 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120886
 *  2. 풀이핵심
 *  - 각 문자열을 구상하는 알파벳을 비교함
 * 3. 풀이후기
 *  - 직접 변경하면서 비교하기보다는 알파벳의 내용만 확인하면 됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("olleh", "hello")); // 1
        System.out.println(solution("allpe", "apple")); //0
    }

    public static int solution(String before, String after) {
        int N = 26, strN = before.length();
        int[] beforeAlpha = new int[N], afterAlpha = new int[N];

        for (int n = 0;n < strN;n++) {
            beforeAlpha[before.charAt(n) - 'a']++;
            afterAlpha[after.charAt(n) - 'a']++;
        }

        for (int n = 0;n < N;n++)
            if (beforeAlpha[n] != afterAlpha[n])
                return 0;

        return 1;
    }
}
