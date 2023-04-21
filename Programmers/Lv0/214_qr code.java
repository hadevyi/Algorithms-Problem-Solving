/**
 * 1. 문제정보
 *  - 제목 : qr code
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181903
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < code.length();i++) {
            if (i % q == r)
                sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}