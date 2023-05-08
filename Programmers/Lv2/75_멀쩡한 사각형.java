/**
 * 1. 문제정보
 *  - 제목 : 멀쩡한 사각형
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/62048
 *  2. 풀이핵심
 *  - 정확한 규칙을 찾기
 * 3. 풀이후기
 *  - 전체 넓이와 제외되는 넓이를 보고 규칙을 찾는다. 이 문제의 경우, 제외되는 값이 최대공약수였다. gcd 구현 한 번 더 진행!
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(8, 12)); // 80
    }

    public static long solution(int w, int h) {
        long width = w, height = h;
        return width * height - (width + height - gcd(w, h));
    }

    public static int gcd(int n, int m) {
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        return m == 0 ? n : gcd(m, n % m);
    }
}
