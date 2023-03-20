/**
 * 1. 문제정보
 *  - 제목 : 덧칠하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/161989
 *  2. 풀이핵심
 *  - 확인이 필요한 구간까지만 확인하며, 배열을 벗어나지 않게 진행해야함
 * 3. 풀이후기
 *  - 숫자들이 1부터 들어오기 떄문에 0번 index는 dummy로 활용함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(8, 4, new int[] {2, 3, 6})); // 2
        System.out.println(solution(5, 4, new int[] {1, 3})); // 1
        System.out.println(solution(4, 1, new int[] {1, 2, 3, 4})); // 4
    }

    public static int solution(int n, int m, int[] section) {
        boolean[] isPainting = new boolean[n + 1]; // 0 dummy

        // 페인팅이 필요한 구간을 true로 만들어 줌
        for (int section_num : section)
            isPainting[section_num] = true;

        // 페인팅이 필요한 구간에서 false로 바꿔주고, 카운팅
        int answer = 0;
        for (int i = 1;i < n + 1;i++) {
            if (!isPainting[i]) continue;
            for (int j = i;j < n + 1 && j < i + m;j++)
                isPainting[j] = false;
            answer++;
        }
        return answer;
    }
}
