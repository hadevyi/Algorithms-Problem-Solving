import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 택배 배달과 수거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/150369
 *  2. 풀이핵심
 *  - stack 활용하기
 * 3. 풀이후기
 *  - 어렵다기보다는 아이디어를 도출하는데 까다로웠다.
 */
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        Stack<Integer> D = new Stack<>();
        Stack<Integer> P = new Stack<>();
        
        for (int i = 0;i < n;i++) {
            D.push(deliveries[i]);
            P.push(pickups[i]);
        }
        
        while (!D.isEmpty() || !P.isEmpty()) {
            while (!D.isEmpty() && D.peek() == 0) D.pop();
            while (!P.isEmpty() && P.peek() == 0) P.pop();
            
            answer += 2 * Math.max(D.size(), P.size());
            
            int total = 0;
            while (!D.isEmpty()) {
                int now = D.pop();
                
                if (total + now <= cap) total += now;
                else {
                    D.push(total + now - cap);
                    break;
                }
            }
            
            total = 0;
            while (!P.isEmpty()) {
                int now = P.pop();
                
                if (total + now <= cap) total += now;
                else {
                    P.push(total + now - cap);
                    break;
                }
            }
        }
        
        return answer;
    }
}