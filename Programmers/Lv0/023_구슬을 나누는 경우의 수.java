import java.math.*;
/**
 * 1. 문제정보
 *  - 제목 : 구슬을 나누는 경우의 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120840
 *  2. 풀이핵심
 *  - 해당 수식을 단순히 구현하면 int, long의 범위를 넘어서서 불가능하다.
 * 3. 풀이후기
 *  - 1차적으로 중복되는 부분을 제거해서 진행하도록했으며, BigInteger를 통해 만들었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 2)); // 3
        System.out.println(solution(5, 3)); // 3
    }

    public static int solution(int balls, int share) {
        return Integer.parseInt(factorialLength(balls, balls - share).divide(factorial(balls - share)).toString());
    }

    public static BigInteger factorial(int num) {
        BigInteger answer = new BigInteger("1");
        for (int i = 1;i <= num;i++)
            answer = answer.multiply(new BigInteger(Integer.toString(i)));
        return answer;
    }

    public static BigInteger factorialLength(int num, int length) {
        BigInteger answer = new BigInteger("1");
        for (int l = 0;l < length;l++)
            answer = answer.multiply(new BigInteger(Integer.toString(num--)));
        return answer;
    }
}
