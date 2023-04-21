/**
 * 1. 문제정보
 *  - 제목 : 1로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181880
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list)
            answer += getCount(num);
        return answer;
    }
    
    public int getCount(int num) {
        int result = 0;
        while (num > 1) {
            if (num % 2 == 0)
                num = num / 2;
            else 
                num = (num - 1) / 2;
            result++;
        }
        return result;
    }
}