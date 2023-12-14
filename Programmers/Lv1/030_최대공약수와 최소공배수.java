import java.util.*;
/**
 *
 * 1. 문제정보
 *  - 제목 : 최대공약수와 최소공배수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12940
 *  2. 풀이핵심
 *  - 최대공약수과 최소공배수 구하기
 * 3. 풀이후기
 *  - 간단한 구현 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(3, 12))); // [3, 12]
        System.out.println(Arrays.toString(solution(2, 5))); // [1, 10]
    }

    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        return new int[] {gcd, lcm};
    }

    public static int gcd(int n, int m) {
        return m == 0? n : gcd(m, n%m);
    }
}
