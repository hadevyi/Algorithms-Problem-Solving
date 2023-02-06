/**
 * 1. 문제정보
 *  - 제목 : 안전지대
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120866
 *  2. 풀이핵심
 *  - 겹치는 구간의 총 길이를 출력하기
 * 3. 풀이후기
 *  - 겹치는 것을 확인하는 것을 배열의 2이상 값으로 분류하고, 수의 범위 조정을 위해 100을 합하는 방식을 진행했음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{0, 2}, {-3, -1}, {-2, 1}})); // 2
        System.out.println(solution(new int[][] {{0, 1}, {2, 5}, {3, 9}})); // 2
        System.out.println(solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}})); // 0
        System.out.println(solution(new int[][] {{0, 5}, {3, 9}, {1, 10}})); // 8
    }

    public static int N = 3, M = 2;
    public static int[] lineData;
    public static int solution(int[][] lines) {
        // -100 <= lines[a] < lines[b] <= 100
        lineData = new int[201];

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;

            for (int i = start; i < end;i++)
                lineData[i]++;
        }

        int answer = 0;
        for (int i = 0;i < 201;i++)
            if (lineData[i] > 1)
                answer++;
        return answer;
    }
}
