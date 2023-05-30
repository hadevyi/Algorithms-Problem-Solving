/**
 * 1. 문제정보
 *  - 제목 : 숫자 블록
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12923
 *  2. 풀이핵심
 *  - 약수 중에서 판별하기
 * 3. 풀이후기
 *  - 소수와 약수를 판별해서 진행하며, 표시할 수 있는 MAX가 정해져있다.
 */
class Solution {
    public int MAX = 10000000;
    public int[] solution(long begin, long end) {
        int N = (int)(end - begin) + 1;
        int[] answer = new int[N];
        
        for (int n = 0;n < N;n++)
            answer[n] = result(begin + n);
        
        return answer;
    }
    
    public int result(long number) {
        int num = (int) number;
        if (num == 1) return 0;
        
        int answer = -1;
        for (int n = 2;n <= Math.sqrt(num);n++) {
            if (num % n == 0) {
                answer = n;
                
                if (num / n <= MAX)
                    return num / n;
            }
        }
        
        return answer == -1 ? 1 : answer;
    }
}