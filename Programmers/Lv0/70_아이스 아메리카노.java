import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 아이스 아메리카노
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120819
 *  2. 풀이핵심
 *  - 반복진행하며 조건에 부합하도록 하기
 * 3. 풀이후기
 *  - 살 수 있는 횟수와 잔돈을 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(5500))); // [1, 0]
        System.out.println(Arrays.toString(solution(15000))); // [2, 4000]
    }

    public static int[] solution(int money) {
        // 아이스 아메리카노 1잔에 5500원
        int count = 0;

        while (money >= 5500) {
            count++;
            money -= 5500;
        }

        return new int[] {count, money};
    }
}
