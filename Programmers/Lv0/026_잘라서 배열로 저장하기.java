import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 잘라서 배열로 저장하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 *  2. 풀이핵심
 *  - 전체 길이를 확인해 Array를 정의해 기록함
 * 3. 풀이후기
 *  - 근래 푼 문제 중에 가장 간단한 문제였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6))); // ["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(solution("abcdef123", 3))); // ["abc", "def", "123"]
    }

    public static String[] solution(String my_str, int n) {
        int N = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[N];

        for (int i = 0;i < N;i++) {
            if (my_str.length() > n) {
                String temp = my_str.substring(0, n);
                answer[i] = temp;
                my_str = my_str.substring(n);
            } else {
                answer[i] = my_str;
            }
        }

        return answer;
    }
}
