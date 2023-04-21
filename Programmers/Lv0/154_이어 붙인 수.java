/**
 * 1. 문제정보
 *  - 제목 : 이어 붙인 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181928
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        StringBuffer even = new StringBuffer(), odd = new StringBuffer();
        for (int num : num_list)
            if (num % 2 == 0) even.append(num);
            else odd.append(num);
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }
}