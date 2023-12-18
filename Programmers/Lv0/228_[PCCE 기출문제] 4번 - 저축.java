/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 4번 / 저축
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250130
 * 2. 풀이핵심
 * - 빈칸 채우기 문제
 * 3. 풀이후기
 * - 간단한 문제 풀이
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {     
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
