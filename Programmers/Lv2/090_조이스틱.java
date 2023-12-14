/**
 * 1. 문제정보
 *  - 제목 : 조이스틱
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42860
 *  2. 풀이핵심
 *  - 브루트포스 접근
 * 3. 풀이후기
 *  - 몇 날 며칠을 했는지 모르겠다... 너무 힘든 문제 ㅜㅜ
 */
class Solution {
    public int solution(String name) {
        int upDown = 0, leftRight = name.length() - 1;
        
        for (int n = 0;n < name.length();n++) {
            char ch = name.charAt(n);
            upDown += Math.min(ch - 'A', 'Z' - ch + 1);
            
            int nextN = n + 1;
            while (nextN < name.length() && name.charAt(nextN) == 'A')
                nextN++;
            
            int aAfterLen = name.length() - nextN;
            
            leftRight = Math.min(leftRight, n * 2 + aAfterLen);
            leftRight = Math.min(leftRight, aAfterLen * 2 + n);
            
            n = nextN - 1;
        }        
        
        return upDown + leftRight;
    }
}