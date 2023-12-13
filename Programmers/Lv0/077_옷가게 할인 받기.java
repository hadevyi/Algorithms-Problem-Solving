/**
 * 1. 문제정보
 *  - 제목 : 옷가게 할인 받기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120818
 *  2. 풀이핵심
 *  - 각 단계의 조건문 순서와 조건 내용, 계산 결과 확인
 * 3. 풀이후기
 *  - 계산 결과가 실수형으로 나와 그에 대한 조절이 중요하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(150000)); // 142500
        System.out.println(solution(580000)); // 464000
    }

    public static int solution(int price) {
        // 10만원 이상 (5%), 30만원 이상 (10%), 50만원 이상 (20%)
        double answer = 0;
        if (price >= 500000)
            answer = price / 100.0 * 20.0;
        else if (price >= 300000)
            answer = price / 100.0 * 10.0;
        else if (price >= 100000)
            answer = price / 100.0 * 5.0;
        return (int) (price - answer);
    }
}
