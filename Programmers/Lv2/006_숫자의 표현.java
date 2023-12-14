/**
 * 1. 문제정보
 *  - 제목 : 숫자의 표현
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12924
 *  2. 풀이핵심
 *  - 연속되는 수의 합이 n이 되도록 확인
 * 3. 풀이후기
 *  - 더이상 확인할 필요가 없는 경우의 제한을 걸어 불필요한 진행을 최소화함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(15)); // 4
    }

    static int[] result;
    public static int solution(int n) {
        int answer = 0;
        result = new int[n + 1]; // 연속된 합
        for (int i = 1;i <= n;i++) {
            for (int j = i;j <= n;j++) {
                if (result[i] + j > n) break;
                result[i] += j;

                if (result[i] == n) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
