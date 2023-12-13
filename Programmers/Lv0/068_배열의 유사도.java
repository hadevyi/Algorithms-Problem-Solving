/**
 * 1. 문제정보
 *  - 제목 : 배열의 유사도
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120903
 *  2. 풀이핵심
 *  - 모든 배열을 비교하기
 * 3. 풀이후기
 *  - 배열의 사이즈를 확인해서 이중포문을 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"})); // 2
        System.out.println(solution(new String[] {"n", "omg"}, new String[] {"m", "dot"})); // 0
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0, N = s1.length, M = s2.length;
        for (int n = 0;n < N;n++)
            for (int m = 0;m < M;m++)
                if (s1[n].equals(s2[m]))
                    answer++;
        return answer;
    }
}
