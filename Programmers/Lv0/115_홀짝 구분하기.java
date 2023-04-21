/**
 * 1. 문제정보
 *  - 제목 : 홀짝 구분하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181944
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " is ");
        if (n % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}