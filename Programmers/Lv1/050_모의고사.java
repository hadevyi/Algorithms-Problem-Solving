import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 모의고사 
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42840
 *  2. 풀이핵심
 *  - 배열의 크기가 다른 경우에 비교하기
 * 3. 풀이후기
 *  - answer를 기준으로 확인하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}))); // [1]
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4, 5}))); // [1]
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1}))); // [1]
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 2, 4, 2}))); // [1, 2, 3]
    }

    public static int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    public static int[] solution(int[] answers) {
        int[][] students = {{1, 0}, {2, 0}, {3, 0}}; // 번호, 맞춘 초기화 값
        int MAX = Integer.MIN_VALUE, maxCount = 0;

        for (int i = 0;i < 3;i++) {
            int[] student = students[i];
            int[] pattern = patterns[i];
            int idx = 0;

            for (int a = 0;a < answers.length;a++) {
                if (idx == pattern.length) idx = 0;
                if (answers[a] == pattern[idx++])
                    student[1]++;
            }

            MAX = Math.max(MAX, student[1]);
        }

        int N = 0, idx = 0;
        for (int[] student : students)
            if (MAX == student[1])
                N++;

        int[] result = new int[N];
        for (int[] student : students)
            if (MAX == student[1])
                result[idx++] = student[0];
        return result;
    }
}
