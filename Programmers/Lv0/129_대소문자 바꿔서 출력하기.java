/**
 * 1. 문제정보
 *  - 제목 : 대소문자 바꿔서 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181949
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuffer sb = new StringBuffer();
        for (char ch : a.toCharArray()) {
            if ('a' <= ch && ch <= 'z')
                sb.append((char)(ch - ('a' - 'A')));
            else 
                sb.append((char)(ch + ('a' - 'A')));
        }
        System.out.println(sb.toString());
    }
}