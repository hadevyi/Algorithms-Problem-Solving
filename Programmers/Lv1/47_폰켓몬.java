import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 폰켓몬
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1845
 *  2. 풀이핵심
 *  - 반환되는 크기와 종류를 비교하기
 * 3. 풀이후기
 *  - 조합인줄 알았으나, 특성을 확인해서 최소를 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {3, 1, 2, 3})); // 2
        System.out.println(solution(new int[] {3, 3, 3, 2, 2, 4})); // 3
        System.out.println(solution(new int[] {3, 3, 3, 2, 2, 2})); // 2
    }

    public static int solution(int[] nums) {
        int MAX = nums.length / 2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums)
            if (!arrayList.contains(num))
                arrayList.add(num);
        int whatKind = arrayList.size();
        return Math.min(MAX, whatKind);
    }
}
