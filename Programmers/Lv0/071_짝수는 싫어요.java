import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝수는 싫어요
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120813
 *  2. 풀이핵심
 *  - 홀수를 확인해 전달함
 * 3. 풀이후기
 *  - 오름차순으로 담긴 배열이라지만, 순서대로 확인하기에 별도의 작업을 할 필요는 없음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(10))); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(solution(15))); // [1, 3, 5, 7, 9, 11, 13, 15]
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1;i <= n;i++)
            if (i % 2 == 1)
                arrayList.add(i);
        int[] answer = new int[arrayList.size()];
        int idx = 0;
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}
