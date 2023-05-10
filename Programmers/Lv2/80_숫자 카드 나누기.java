/**
 * 1. 문제정보
 *  - 제목 : 숫자 카드 나누기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/135807
 *  2. 풀이핵심
 *  - 최대공약수를 구해 추가 확인을 거쳐 진행
 * 3. 풀이후기
 *  - 최대공약수에 대한 접근은 알았으나,
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {10, 17}, new int[] {5, 20})); // 0
        System.out.println(solution(new int[] {10, 20}, new int[] {5, 17})); // 10
        System.out.println(solution(new int[] {14, 35, 119}, new int[] {18, 30, 102})); // 7
    }

    public static int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);

        gcdA = isCheck(arrayB, gcdA);
        gcdB = isCheck(arrayA, gcdB);
        return Math.max(gcdA, gcdB);
    }

    public static int isCheck(int[] arr, int value) {
        if (value == 1) {
            return 0;
        }

        for (int data : arr)
            if (data % value == 0)
                return 0;
        return value;
    }

    public static int getGCD(int[] arr) {
        if (arr.length == 1) return arr[0];
        int result = gcd(arr[0], arr[1]);
        for (int n = 2;n < arr.length;n++)
            result = gcd(result, arr[n]);
        return result;
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
