import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 연속된 수의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 *  2. 풀이핵심
 *  - 연속되는 숫자의 배열을 찾는 과정이 필요함
 * 3. 풀이후기
 *  - x를 구할 수 있는 수식을 역으로 구성함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(3, 12))); //	[3, 4, 5]
        System.out.println(Arrays.toString(solution(5, 15))); //	[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(solution(4, 14))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(solution(5, 5))); // [-1, 0, 1, 2, 3]
    }

    public static int[] solution(int num, int total) {
        int dummy = 0;
        for (int i = 1;i < num;i++)
            dummy += i;
        int x = (total - dummy) / num;

        int[] answer = new int[num];

        for (int i = 0;i < num;i++)
            answer[i] = x++;

        return answer;
    }
}
