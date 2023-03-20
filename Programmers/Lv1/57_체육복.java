/**
 * 1. 문제정보
 *  - 제목 : 체육복
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
 *  2. 풀이핵심
 *  - 조건에 따라 학생의 상태를 초기화해준 후에 단계 진행
 * 3. 풀이후기
 *  - i일 경우 i - 1 or i + 1만 확인할 수 있음을 확인해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(5, new int [] {2, 4}, new int [] {1, 3, 5})); // 5
        System.out.println(solution(5, new int [] {2, 4}, new int [] {3})); // 4
        System.out.println(solution(3, new int [] {3}, new int [] {1})); // 2
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 1]; // 0 dummy
        for (int i = 1;i <= n ;i++) student[i] = 0;
        for (int lostNum : lost) student[lostNum]--;
        for (int reserveNum : reserve) student[reserveNum]++;

        for (int i = 1;i <= n;i++)
            if (student[i] == -1)
                if (student[i - 1] == 1) {
                    student[i - 1]--;
                    student[i]++;
                } else if (i + 1 <= n && student[i + 1] == 1) {
                    student[i + 1]--;
                    student[i]++;
                }

        int answer = 0;
        for (int i = 1;i <= n;i++)
            if (student[i] >= 0)
                answer++;
        return answer;
    }
}
