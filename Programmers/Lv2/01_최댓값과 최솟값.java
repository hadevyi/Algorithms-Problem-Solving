import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최댓값과 최솟값
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12939
 *  2. 풀이핵심
 *  - 공백만큼 정제하고 정렬해서 최소/최대를 출력하기
 * 3. 풀이후기
 *  - Array와 sort 후 간단한 출력문제
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4")); // 1 4
        System.out.println(solution("-1 -2 -3 -4")); // -4 -1
        System.out.println(solution("-1 -1")); // -1 -1
    }

    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int[] list = new int[st.countTokens()];
        for (int i = 0;i < list.length;i++)
            list[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(list);
        return list[0] + " " + list[list.length - 1];
    }
}
