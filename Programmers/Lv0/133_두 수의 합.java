/**
 * 1. 문제정보
 *  - 제목 : 두 수의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181846
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger aInt = new BigInteger(a);
        BigInteger bInt = new BigInteger(b);
        BigInteger result = aInt.add(bInt);
        return result.toString();
    }
}