/**
 * 1. 문제정보
 *  - 제목 : 문자열 반복해서 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181950
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0;i < n;i++)
            System.out.print(str);
    }
}