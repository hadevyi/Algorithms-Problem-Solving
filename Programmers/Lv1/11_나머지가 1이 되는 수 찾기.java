/**
 * 1. 문제정보
 *  - 제목 : 나머지가 1이 되는 수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/87389
 *  2. 풀이핵심
 *  - 나머지 연산자 확인하기
 * 3. 풀이후기
 *  - 범위가 있기에, 해당 만큼 반복하면서 반환하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10)); // 3
        System.out.println(solution(12)); // 11
    }

    public static int solution(int n) {
        for (int i = 1;i <= 1000000 && i < n;i++)
            if (n % i == 1) return i;
        return 0;
    }
}
