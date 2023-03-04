/**
 * 1. 문제정보
 *  - 제목 : 문자열 내림차순으로 배치하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12917
 *  2. 풀이핵심
 *  - 문자열의 빈도수를 확인해 역으로 출력함
 * 3. 풀이후기
 *  - 여러개가 나올 수 있다는 전제하에 진행하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("Zbcdefg")); // gfedcbZ
    }

    public static String solution(String s) {
        int N = 58;
        int[] alpha = new int[N];
        StringBuffer sb = new StringBuffer();

        for (char ch : s.toCharArray())
            alpha[ch - 'A']++;

        for (int n = N - 1;n >= 0;n--)
            while (alpha[n]-- > 0)
                sb.append((char)('A' + n));

        return sb.toString();
    }
}
