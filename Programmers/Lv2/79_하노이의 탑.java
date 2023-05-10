import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 하노이의 탑
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12946
 *  2. 풀이핵심
 *  - 순서대로 어떻게 기준이 바뀌는지 확인해봐야함
 * 3. 풀이후기
 *  - 정말 오랜만에 푼 하노이의 탑
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2)); // [[1,2], [1,3], [2,3]]
    }

    public static ArrayList<int[]> arrayList = new ArrayList<>();
    public static int[][] solution(int n) {
        hanoi(n, 1, 2, 3);

        int idx = 0;
        int[][] answer = new int[arrayList.size()][2];
        for (int[] data : arrayList)
            answer[idx++] = data.clone();
        return answer;
    }

    public static void hanoi(int num, int now, int temp, int target) {
        if (num == 0) return;
        hanoi(num - 1, now, target, temp);
        arrayList.add(new int[] {now, target});
        hanoi(num - 1, temp, now, target);
    }
}
