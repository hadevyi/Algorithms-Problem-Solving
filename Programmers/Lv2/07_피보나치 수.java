import java.math.*;
/**
 * 1. 문제정보
 *  - 제목 : 피보나치 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12945
 *  2. 풀이핵심
 *  - 최대 수인 100000의 피보나치를 계산하면 int, long의 범위를 한참 초과한다.
 *  - BigInteger를 활용했다.
 * 3. 풀이후기
 *  - BigInteger가 아닌 나머지로만으로도 계산한다면 BigInteger가 아닌 int 배열로 해결할 수 있었을 것같다.
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(3)); // 2
        System.out.println(solution(5)); // 5
        System.out.println(solution(100000));
    }

    public static int N;
    public static BigInteger[] list;
    public static int solution(int n) {
        N = n + 1;
        list = new BigInteger[N];
        list[0] = new BigInteger("0");
        list[1] = new BigInteger("1");
        for (int i = 2;i < N;i++)
            list[i] = list[i - 1].add(list[i - 2]);
        return Integer.parseInt(list[n].mod(new BigInteger("1234567")).toString());
    }
}
