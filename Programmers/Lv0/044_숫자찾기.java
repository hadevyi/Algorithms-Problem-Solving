/**
 * 1. 문제정보
 *  - 제목 : 숫자 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120904
 *  2. 풀이핵심
 *  - 각 자리수를 확인하며, 처음 나오는 순서를 반환함
 * 3. 풀이후기
 *  - 간단한 구현 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(29183, 1)); // 3
        System.out.println(solution(232443, 4)); // 4
        System.out.println(solution(123456, 7)); // -1
    }

    public static int solution(int num, int k) {
        String str = Integer.toString(num);
        char kChar = (char)('0' + k);
        int Len = str.length();

        for (int len = 0;len < Len;len++)
            if (str.charAt(len) == kChar)
                return len + 1;

        return -1;
    }
}
