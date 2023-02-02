/**
 * 1. 문제정보
 *  - 제목 : 다음에 올 숫자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120924?language=java
 *  2. 풀이핵심
 *  - 0~2의 숫자의 차이를 확인해 등차/등비인지 확인하기
 * 3. 풀이후기
 *  - 각 부분을 함수화하여 더 쉽게 사용할 수 있도록 구성해보았다.
 *  - 프로그래머스 문제는 입력 처리가 제일 까다로운 것같다...
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
    }

    public static int solution(int[] common) {
        int N = common.length;

        if (check(common[0], common[1], common[2])) return common[N - 1] + d1(common[0], common[1]);
        return common[N - 1] * d2(common[0], common[1]);
    }

    public static boolean check(int n1, int n2, int n3) {
        if (n2 - n1 == n3 - n2) return true;
        return false;
    }

    public static int d1(int n1, int n2) {
        return n2 - n1;
    }

    public static int d2(int n1, int n2) {
        return n2/n1;
    }
}
