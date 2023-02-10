/**
 * 1. 문제정보
 *  - 제목 : 종이 자르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120922
 *  2. 풀이핵심
 *  - 반으로 잘랐을 때, 정수 단위로 잘라야하기에 해당 조건을 확인함
 * 3. 풀이후기
 *  - 재귀함수를 활용해 진행하였으며, 큰 쪽 방향을 기준으로 자름
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 2)); // 3
        System.out.println(solution(2, 5)); // 9
        System.out.println(solution(1, 1)); // 0
    }

    public static int COUNT;

    public static int solution(int M, int N) {
        COUNT = 0;
        findCutCount(M, N);
        return COUNT;
    }

    public static void findCutCount(int M, int N) {
        if (M == 1 && N == 1) return;
        if (M < N) {
            int temp = M;
            M = N;
            N = temp;
        }

        COUNT++;
        findCutCount(M / 2, N);
        if (M % 2 == 0) findCutCount(M / 2, N);
        else  findCutCount(M / 2 + 1, N);
    }
}
