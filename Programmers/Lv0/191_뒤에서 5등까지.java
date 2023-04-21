/**
 * 1. 문제정보
 *  - 제목 : 뒤에서 5등까지
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181853
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[5];
        for (int i = 0;i < 5;i++)
            answer[i] = num_list[i];
        return answer;
    }
}