/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 5번 / 산책
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250129
 * 2. 풀이핵심
 * - 빈칸채우기 문제
 * 3. 풀이후기
 * - 본문에 풀이가 다 적혀있는 문제이다.
 */
class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}