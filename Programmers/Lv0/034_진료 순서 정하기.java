import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 진료 순서 정하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120835
 *  2. 풀이핵심
 *  - 입력된 순서의 진료 순서를 전달함
 * 3. 풀이후기
 *  - 정렬하는 문제인 줄 알았으나, 다시 진행했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {3, 76, 24}))); // [3, 1, 2]
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6, 7}))); // [7, 6, 5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(solution(new int[] {30, 10, 23, 6, 100}))); // [2, 4, 3, 5, 1]
    }

    public static int[] solution(int[] emergency) {
        int N = emergency.length;
        int[][] emergencyNumber = new int[N][2];

        for (int i = 0;i < N;i++) {
            emergencyNumber[i][0] = emergency[i];
            emergencyNumber[i][1] = 1;
        }

        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (i == j) continue;
                if (emergencyNumber[i][0] < emergencyNumber[j][0])
                    emergencyNumber[i][1]++;
            }
        }

        int[] answer = new int[N];
        for (int i = 0;i < N;i++)
            answer[i] = emergencyNumber[i][1];
        return answer;
    }
}
