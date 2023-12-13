/**
 * 1. 문제정보
 *  - 제목 : 순서쌍의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120836
 *  2. 풀이핵심
 *  - n을 나누어 떨어트릴 수 있다면 순서쌍으로 만들 수 있음
 * 3. 풀이후기
 *  - 1부터 n까지 나머지가 0으로 되는 수의 개수를 찾으면 됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(20)); // 6
        System.out.println(solution(100)); // 9
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1;i <= n;i++)
            if (n % i == 0)
                answer++;
        return answer;
    }
}
