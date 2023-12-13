/**
 * 1. 문제정보
 *  - 제목 : 개미 군단
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120837
 *  2. 풀이핵심
 *  - 연산자 활용하기
 * 3. 풀이후기
 *  - 몫과 나머지 연산자를 활용하면 됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(23)); // 5
        System.out.println(solution(24)); // 6
        System.out.println(solution(999)); // 201
    }

    public static int solution(int hp) {
        // 장군(5), 병정(3), 일(1)
        int answer = 0;
        answer += hp / 5;   // 장군 결과
        hp -= (hp / 5) * 5; // hp에 장군 값 빼기
        answer += hp / 3;   // 병정 결과
        hp -= (hp / 3) * 3; // hp에 병정 값 빼기
        answer += hp;       // 일 결과 합산
        return answer;
    }
}
