import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n의 배수 고르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120905
 *  2. 풀이핵심
 *  - 입력 순서대로 조건을 출력
 * 3. 풀이후기
 *  - 배수를 전달하는 것인데, 입력대로 하는 것이 특징이였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12}))); // [6, 9, 12]
        System.out.println(Arrays.toString(solution(5, new int[] {1, 9, 3, 10, 13, 5}))); // [10, 5]
        System.out.println(Arrays.toString(solution(12, new int[] {2, 100, 120, 600, 12, 12}))); // [120, 600, 12, 12]
    }

    public static int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = numlist.length;

        for (int i = 0;i < N;i++)
            if (numlist[i] % n == 0)
                arrayList.add(numlist[i]);

        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}
