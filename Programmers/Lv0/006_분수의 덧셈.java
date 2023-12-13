import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 분수의 덧셈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120808
 *  2. 풀이핵심
 *  - 최대공약수를 활용한 방법으로 기약분수를 반환해야 함
 * 3. 풀이후기
 *  - 유클리드 호제법을 다시 복기하면서, 약분하는 방법을 적용함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4))); // [5, 4]
        System.out.println(Arrays.toString(solution(9, 2, 1, 3))); // [29, 6]
        System.out.println(Arrays.toString(solution(2, 8, 2, 8))); // [1, 2]
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator  = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        int base = gcd(numerator, denominator);
        return new int[] {numerator / base, denominator / base};
    }

    public static int gcd(int num1, int num2) {
        if (num1 <= num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 == 0)
            return num1;
        return gcd(num2, num1%num2);
    }
}
