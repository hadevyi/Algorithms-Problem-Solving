/**
 * 1. 문제정보
 *  - 제목 : 왼쪽 오른쪽
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181890#
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String[] solution(String[] str_list) {        
        for (int i = 0;i < str_list.length;i++) {
            if (str_list[i].equals("l")) {
                String[] result = new String[i];
                for (int n = 0;n < i;n++)
                    result[n] = str_list[n];
                return result;
            } else if (str_list[i].equals("r")) {
                int idx = 0;
                String[] result = new String[str_list.length - i - 1];
                for (int n = i + 1;n < str_list.length;n++)
                    result[idx++] = str_list[n];
                return result;
            }
        }
        
        return new String[] {};
    }
}