/**
 * 1. 문제정보
 *  - 제목 : 배열의 길이를 2의 거듭제곱으로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181857
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] twoDouble = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    public int[] solution(int[] arr) {
        if (isDouble(arr.length)) return arr;
        
        int N = getNewLen(arr.length);
        int[] answer = new int[N];
        for (int i = 0;i < arr.length;i++)
            answer[i] = arr[i];
        return answer;
    }
    
    public int getNewLen(int len) {
        for (int i = 0;i < twoDouble.length;i++)
            if (len < twoDouble[i])
                return twoDouble[i];
        return -1;
    }
    
    public boolean isDouble(int len) {
        for (int twoData : twoDouble)
            if (twoData == len)
                return true;
        return false;
    }
}