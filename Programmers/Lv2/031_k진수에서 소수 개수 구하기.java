import java.math.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : k진수에서 소수 개수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92335
 *  2. 풀이핵심
 *  - 범위의 수가 넓은 수의 셈과 소수 판별
 * 3. 풀이후기
 *  - 범위가 너무 넓어서 BigInteger를 활용했으며, 소수판별은 대칭임을 감안해 Math.sqrt()를 활용했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(437674, 3)); // 3
        System.out.println(solution(110011, 10)); // 2
        System.out.println(solution(1700705, 10)); // 3
        System.out.println(solution(1000000, 8)); //
    }

    public static int solution(int n, int k) {
        String strN = Integer.toString(n);
        BigInteger bigInteger = new BigInteger(strN);

        // k가 10이 아닌 경우에만 원하는 k진수로 바꾸기
        if (k != 10) {
            StringBuffer sb = new StringBuffer();
            while (bigInteger.compareTo(new BigInteger("0")) == 1) {
                sb.append(bigInteger.mod(new BigInteger(Integer.toString(k))));
                bigInteger = bigInteger.divide(new BigInteger(Integer.toString(k)));
            }
            bigInteger = new BigInteger(sb.reverse().toString());
        }

        StringTokenizer st = new StringTokenizer(bigInteger.toString(), "0");
        int SIZE = st.countTokens(), answer = 0;

        for (int size = 0;size < SIZE;size++) {
            if (isPrime(Long.parseLong(st.nextToken())))
                answer++;
        }

        return answer;
    }

    public static boolean isPrime(Long n) {
        if (n == 1) return false;
        for (Long i = 2L;i <= Math.sqrt(n);i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
