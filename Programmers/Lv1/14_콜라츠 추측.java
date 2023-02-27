/**
 * 1. 문제정보
 *  - 제목 : 콜라츠 추측
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12943
 *  2. 풀이핵심
 *  - 각 조건을 구현해 반복하며 진행
 * 3. 풀이후기
 *  - 계산 중, int의 범위를 넘는 구간이 있어서 이를 확인해야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(6)); // 8
        System.out.println(solution(16)); // 4
        System.out.println(solution(626331)); // -1
    }

    public static int solution(int num) {
        if (num == 1) return 0;
        long data = num;
        int answer = 0;

        while (true) {
            answer++;
            data = data % 2 == 0 ? data / 2 : data * 3 + 1;
            if (answer > 500) return -1;
            if (data == 1) break;
        }

        return answer;
    }
}
