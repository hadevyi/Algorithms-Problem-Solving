/**
 * 1. 문제정보
 *  - 제목 : 치킨 쿠폰
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120884
 *  2. 풀이핵심
 *  - 몫과 나머지를 구하는 나눗셈 연상을 활용하기
 * 3. 풀이후기
 *  - 현재 조건을 구현하는 것보다 순서를 배정하는 것이 더 까다로웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int nowCoupon, bounsCoupon;
    public static int solution(int chicken) {
        nowCoupon = chicken;
        bounsCoupon = 0;

        while (nowCoupon >= 10) {
            bounsCoupon += nowCoupon / 10;
            int bouns = nowCoupon / 10;
            nowCoupon -= (nowCoupon / 10) * 10;
            nowCoupon += bouns;
        }

        return bounsCoupon;
    }
}
