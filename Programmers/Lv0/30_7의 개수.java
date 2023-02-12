/**
 * 1. 문제정보
 *  - 제목 : 7의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 *  2. 풀이핵심
 *  - 7의 개수를 세는 과정이 중요함
 * 3. 풀이후기
 *  - String의 각 구성을 확인하며 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {7, 77, 17})); // 4
        System.out.println(solution(new int[] {10, 29})); // 0
    }

    public static int solution(int[] array) {
        int N = array.length, answer = 0;

        for (int n = 0;n < N;n++) {
            String str = Integer.toString(array[n]);
            int strN = str.length();
            for (int i = 0;i < strN;i++)
                if (str.charAt(i) == '7')
                    answer++;
        }

        return answer;
    }
}
