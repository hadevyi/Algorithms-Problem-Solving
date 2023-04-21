/**
 * 1. 문제정보
 *  - 제목 : 수열과 구간 쿼리 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181883
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0;i < queries.length;i++) {
            int[] query = queries[i];
            for (int j = 0;j < arr.length;j++)
                if (query[0] <= j && j <= query[1])
                    arr[j] += 1;
        }
        return arr;
    }
}