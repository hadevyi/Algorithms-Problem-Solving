/**
 * 1. 문제정보
 *  - 제목 : 양꼬치
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120830
 *  2. 풀이핵심
 *  - 나올 수 있는 셈을 진행해 결과 확인
 * 3. 풀이후기
 *  - 간단한 수식으로 해결함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10, 3)); // 124000
        System.out.println(solution(64, 6)); // 768000
    }

    public static int solution(int n, int k) {
        // 양꼬치 n인분(12000)과 음료수 k개(2000)
        return n * 12000 + (k - (n / 10)) * 2000;
    }
}
