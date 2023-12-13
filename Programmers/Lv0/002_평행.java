/**
 * 1. 문제정보
 *  - 제목 : 평행
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120875
 *  2. 풀이핵심
 *  - 중복없이 4개의 점으로 이을 수 있는 것은 3가지 
 * 3. 풀이후기
 *  - 기울기를 구하는 공식과 비교하여 진행하였음
 */
public class Solution {

    public void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}})); // 1
        System.out.println(solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}})); // 0
    }

    public int N = 4;
    public int solution(int[][] dots) {

        // 1 2  3 4
        // 1 3  2 4
        // 1 4  2 3

        int answer = 0;
        return getGradient(dots[0], dots[1]) == getGradient(dots[2], dots[3])
                || getGradient(dots[0], dots[2]) == getGradient(dots[1], dots[3])
                || getGradient(dots[0], dots[3]) == getGradient(dots[1], dots[2])
                ? 1 : 0;
    }

    public double getGradient(int[] point1, int[] point2) {
        // index 0 : x, index 1 : y
        return (double) (point1[0] - point2[0]) / (double) (point1[1] - point2[1]);
    }
}
