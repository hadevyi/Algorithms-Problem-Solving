import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 명예의 전당 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/138477
 *  2. 풀이핵심
 *  - 기준치 전후의 결과 출력을 고려하면 됨
 * 3. 풀이후기
 *  - 이미 있는 함수를 통해 쉽게 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}))); // [10, 10, 10, 20, 20, 100, 100]
        System.out.println(Arrays.toString(solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}))); // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    }

    public static int[] solution(int k, int[] score) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int idx = 0;
        int N = score.length;
        int[] answer = new int[N];

        for (int data : score) {
            arrayList.add(data);
            Collections.sort(arrayList, Collections.reverseOrder());

            answer[idx++] = (arrayList.size() < k) ? arrayList.get(arrayList.size() - 1) : arrayList.get(k - 1);
        }

        return answer;
    }
}
