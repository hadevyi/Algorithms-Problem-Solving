/**
 * 1. 문제정보
 *  - 제목 : 편지
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120898
 *  2. 풀이핵심
 *  - 문자의 길이 구하기
 * 3. 풀이후기
 *  - 한 글자에 2개를 소요하기에 2배해야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("happy birthday!")); // 30
        System.out.println(solution("I love you~")); // 22
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
