/**
 * 1. 문제정보
 *  - 제목 : 문자열 돌리기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181945
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch : a.toCharArray())
            System.out.println(ch);
    }
}