/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 2번 / 피타고라스의 정리
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250132
 * 2. 풀이핵심
 * - 디버깅 : 한줄만 수정하기
 * 3. 풀이후기
 * - 새로운 문제 유형이다 꽤 재밌는데?
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c * c - a * a;

        System.out.println(b_square);
    }
}