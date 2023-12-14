import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 자연수 뒤집어 배열로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12932
 *  2. 풀이핵심
 *  - 각 자리를 뒤집기
 * 3. 풀이후기
 *  - 위치를 반대로 해서 전달함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(12345))); // [5, 4, 3, 2, 1]
    }

    public static int[] solution(long n) {
        String str = Long.toString(n);
        int Len = str.length(), idx = 0;

        int[] answer = new int[Len];
        for (int len = Len - 1;len >= 0;len--)
            answer[idx++] = str.charAt(len) - '0';
        return answer;
    }
}
