/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞게 수열 변환하기 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181881
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        Map<Integer, int[]> map = new HashMap<>();
        map.put(0, arr);
        while (true) {
            int[] temp = map.get(map.size() - 1).clone();
            
            for (int i = 0;i < temp.length;i++) {
                if (temp[i] >= 50 && temp[i] % 2 == 0)
                    temp[i] = temp[i] / 2;
                else if (temp[i] < 50 && temp[i] % 2 == 1)
                    temp[i] = temp[i] * 2 + 1;
            }
            
            map.put(++count, temp);
            if (isCheck(map.get(count - 1), map.get(count)))
                break;
            
        }
        return count - 1;
    }
    
    public boolean isCheck(int[] arr1, int[] arr2) {
        for (int i = 0;i < arr1.length;i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
}