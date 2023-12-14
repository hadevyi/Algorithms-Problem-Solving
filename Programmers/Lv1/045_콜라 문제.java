/**
 * 1. 문제정보
 *  - 제목 : 콜라 문제
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132267
 *  2. 풀이핵심
 *  - 각 단계 별로 구현해 진행함
 * 3. 풀이후기
 *  - 빈병, 가져가야할 병, 받는 병 순서대로 모두 확인할 수 있었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 1, 20)); // 19
        System.out.println(solution(3, 1, 20)); // 9
    }

    public static int ADD;

    public static int solution(int a, int b, int n) {
        ADD = 0;
        getCola(a, b, n);
        return ADD;
    }

    public static void getCola(int basic, int give, int nowNum) {
        if (nowNum < basic) return;

        int giveToMart = 0, takeFromMart = 0;
        for (int i = 1;i <= nowNum;i++) {
            if (giveToMart + basic > nowNum) break;
            giveToMart += basic;
            takeFromMart += give;
        }

        ADD += takeFromMart;
        getCola(basic, give, nowNum - giveToMart + takeFromMart);
    }
}
