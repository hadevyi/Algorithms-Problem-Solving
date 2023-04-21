/**
 * 1. 문제정보
 *  - 제목 : 홀짝에 따라 다른 값 반환하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181935
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int num = 2;num <= n;num += 2)
                answer += num * num;
        } else {
            for (int num = 1;num <= n;num += 2)
                answer += num;
        }
        return answer;
    }
}