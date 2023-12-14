import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 원 사이의 정수 쌍
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181187#
 *  2. 풀이핵심
 *  - 데이터 형 확인
 * 3. 풀이후기
 *  - 반절만 확인해서 진행하였으며, 중복이 나오는 부분에 대해서만 감소시켜주었다.
 */
class Solution {
    public long solution(int r1, int r2) {        
        long answer = 0;
        long radius1 = (long) r1, radius2 = (long) r2;
        
        for (long x = 0;x <= radius2;x++) {
            double maxBiggerY = Math.sqrt(radius2 * radius2 - x * x);
            double minBiggerY = Math.sqrt(radius1 * radius1 - x * x);
            
            if (Double.isNaN(minBiggerY)) minBiggerY = 0.0;
            long tempAnswer = (long)(Math.floor(maxBiggerY) - Math.ceil(minBiggerY) + 1) * 2;
            
            if (radius1 * radius1 <= x * x && x * x <= radius2 * radius2) tempAnswer -= 1;
            answer += x == 0 ? tempAnswer : tempAnswer * 2;
        }
        
        return answer;
    }
}