/**
 * 1. 문제정보
 *  - 제목 : 약수의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12928
 *  2. 풀이핵심
 *  - 약수 확인하기
 * 3. 풀이후기
 *  - 약수 전체의 합을 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(12)); // 28
        System.out.println(solution(5)); // 6
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1;i <= n;i++)
            if (n % i == 0)
                answer += i;
        return answer;
    }
}
