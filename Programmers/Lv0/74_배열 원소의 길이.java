import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 원소의 길이
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120854
 *  2. 풀이핵심
 *  - 모든 순서를 확인하며 길이를 반환함
 * 3. 풀이후기
 *  - 전체 길이를 확인해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"We", "are", "the", "world!"}))); // [2, 3, 3, 6]
        System.out.println(Arrays.toString(solution(new String[] {"I", "Love", "Programmers."}))); // [1, 4, 12]
    }

    public static int[] solution(String[] strlist) {
        int N = strlist.length;
        int[] answer = new int[N];
        for (int n = 0;n < N;n++)
            answer[n] = strlist[n].length();
        return answer;
    }
}
