/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 3번 / 나이 계산
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250131
 * 2. 풀이핵심
 * - 빈칸 채우기
 * 3. 풀이후기
 * - 간단한 문제 풀이
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {            
            answer = 2030 - year;
        }

        System.out.println(answer);
    }
}