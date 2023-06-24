/**
 * 1. 문제정보
 *  - 제목 : 유사 칸토어 비트열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/148652
 *  2. 풀이핵심
 *  - 총 길이 확인 후 직접 구현
 * 3. 풀이후기
 *  - 각 위치가 파생되는 곳을 확인하는 것도 중요하였고, long을 활용하는 것 역시 어색하였다.
 */
class Solution {
    public int solution(int n, long l, long r) {
        int answer = 0;
        for (l--;l < r;l++) {
            if (getNumber(l) == 0) continue;
            answer++;
        }
        return answer;
    }

    public int getNumber(long num) {
        while (num != 0) {
            if (num % 5 == 2) return 0;   
            num /= 5;
        }
        return num == 2 ? 0 : 1;
    }
}