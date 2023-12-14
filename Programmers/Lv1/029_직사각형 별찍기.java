import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 직사각형 별찍기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12969
 *  2. 풀이핵심
 *  - 행/열의 반복 위치를 명확하게 아는 것이 중요함
 * 3. 풀이후기
 *  - 간단한 별찍기 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0;i < b;i++) {
            for (int j = 0; j < a; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
