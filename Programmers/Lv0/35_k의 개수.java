/**
 * 1. 문제정보
 *  - 제목 : k의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120887
 *  2. 풀이핵심
 *  - i부터 j까지의 반복하며 k의 갯수 카운팅
 * 3. 풀이후기
 *  - 간단한 반복문으로 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(1, 13, 1)); // 6
        System.out.println(solution(10, 50, 5)); // 5
        System.out.println(solution(3, 10, 2)); // 0
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i;n <= j;n++) {
            char[] ch = Integer.toString(n).toCharArray();
            for (char c : ch)
                if (c - '0' == k)
                    answer++;
        }
        return answer;
    }
}
