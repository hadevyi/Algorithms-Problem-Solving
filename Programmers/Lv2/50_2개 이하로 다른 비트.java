/**
 * 1. 문제정보
 *  - 제목 : 2개 이하로 다른 비트
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77885#
 *  2. 풀이핵심
 *  - 짝수와 홀수일때 따르고, 홀수일때 0의 유무에 따라 다르다
 * 3. 풀이후기
 *  - 로직은 다 맞았는데, 파라미터값으로 넘겨주는 내용이 달랐다. 허무하면서도 아쉬운 느낌..
 */
import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i = 0;i < numbers.length;i++) {
            if (numbers[i] % 2 == 0)
                answer[i] = numbers[i] + 1;
            else {
                long value = getTen(nextOneBite(getBinary(numbers[i])));
                answer[i] = value;
            }
        }
        return answer;
    }
    
    public long getTen(String value) {
        long result = 0;
        for (int i = value.length() - 1, j = 0;i >= 0;i--, j++)
            result += (value.charAt(i) - '0') * (long)(Math.pow(2, j));
        return result;
    }
    
    public String nextOneBite(String value) {
        StringBuffer sb = new StringBuffer();
        
        if (!value.contains("0")) {
            // 111
            sb.append("10");
            sb.append(value.substring(1));
        } else {
            // 1011 => 1101
            int idx = value.lastIndexOf("01");
            sb.append(value.substring(0, idx));
            sb.append("10");
            if (idx + 2 <= value.length())
                sb.append(value.substring(idx + 2));
        }
        return sb.toString();
    }
    
    public String getBinary(long number) {
        StringBuffer sb = new StringBuffer();
        while (number > 0) {
            sb.append(number % 2);
            number = number / 2;
        }
        return sb.reverse().toString();
    }
}