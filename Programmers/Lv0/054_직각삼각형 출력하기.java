import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 직각삼각형 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120823
 *  2. 풀이핵심
 *  - 가장 기본적인 반복문 출력 문제
 * 3. 풀이후기
 *  - 오랜만에 scanner를 사용해보았음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i <= n;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
