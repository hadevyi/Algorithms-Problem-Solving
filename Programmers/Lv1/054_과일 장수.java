import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 과일 장수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/135808
 *  2. 풀이핵심
 *  - 최대한 많은 내용을 보내기 위해, 정렬을 진행한 후 갯수만큼 진행함
 * 3. 풀이후기
 *  - 범위가 넘어간다면, return하는 제한을 걸어둠
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1})); // 8
        System.out.println(solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2})); // 33
    }


    static int TOTAL;
    public static int solution(int k, int m, int[] score) {
        TOTAL = 0;
        int idx = 0;
        Integer[] scoreList = new Integer[score.length];
        for (int data : score)
            scoreList[idx++] = data;
        Arrays.sort(scoreList, Collections.reverseOrder());

        checkRange(m - 1, m, scoreList);
        return TOTAL;
    }

    public static void checkRange(int idx, int gap, Integer[] score) {
        if (idx >= score.length) return;
        TOTAL += score[idx] * gap;
        checkRange(idx + gap, gap, score);
    }
}