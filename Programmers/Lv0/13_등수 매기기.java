import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 등수 매기기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120882
 *  2. 풀이핵심
 *  - 평균 결과에 따른 등수
 * 3. 풀이후기
 *  - eachScore에 저장하는 값은 평균값으로, 소수점을 저장할 수 있는 실수형으로 진행해야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}}))); // [1, 2, 4, 3]
        System.out.println(Arrays.toString(solution(new int[][] {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}))); // [4, 4, 6, 2, 2, 1, 7]
    }

    public static int[] solution(int[][] score) {
        int N = score.length;
        double M = 2.0;
        double[] eachScore = new double[N];

        for (int n = 0;n < N;n++)
            eachScore[n] += (score[n][0] + score[n][1]) / M;

        int[] answer = new int[N];
        for (int i = 0;i < N;i++) {
            int count = 1;
            for (int j = 0;j < N;j++) {
                if (i == j) continue;
                if (eachScore[i] < eachScore[j]) count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
