/**
 * 1. 문제정보
 *  - 제목 : 배열에서 문자열 대소문자 변환하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181875
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0;i < strArr.length;i++) {
            if (i % 2 == 0)
                strArr[i] = strArr[i].toLowerCase();
            else
                strArr[i] = strArr[i].toUpperCase();
        }
        return strArr;
    }
}