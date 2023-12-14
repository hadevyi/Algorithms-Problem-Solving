/**
 * 1. 문제정보
 *  - 제목 : 부족한 금액 계산하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/82612
 *  2. 풀이핵심
 *  - 필요금액과 현재 금액의 차액 확인하기
 * 3. 풀이후기
 *  - 부족하지 않으면 0을 반환하는 조건 확인이 필수
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 20, 4)); // 10
    }

    public static long solution(int price, int money, int count) {
        long needMoney = 0;

        for (int i = 1;i <= count;i++)
            needMoney += price * i;

        return needMoney < money ? 0 : needMoney - money;
    }
}
