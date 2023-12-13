/**
 * 1. 문제정보
 *  - 제목 : 중복된 문자 제거
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120888
 *  2. 풀이핵심
 *  - ASCII Code값을 기준으로 진행함
 * 3. 풀이후기
 *  - 나오는 char 중의 가장 뒤의 나오는 'z'와 가장 앞에 나오는 ' '가 약 96의 차이가 있어, 100을 선언하고 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("people")); // peol
        System.out.println(solution("We are the world")); // We arthwold
    }

    public static String solution(String my_string) {
        int N = 100, Len = my_string.length();
        boolean[] isExist = new boolean[N];

        StringBuffer sb = new StringBuffer();
        for (int len = 0;len < Len;len++) {
            int value = my_string.charAt(len) - ' ';

            if (!isExist[value]) {
                isExist[value] = true;
                sb.append(my_string.charAt(len));
            }
        }

        return sb.toString();
    }
}
