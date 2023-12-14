import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 로또의 최고 순위와 최저 순위
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77484
 *  2. 풀이핵심
 *  - 기본의 결과와 가능성의 경우를 확인함
 * 3. 풀이후기
 *  - 각 결과가 대치되는 hashmap을 활용해 진행함.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19}))); // [3, 5]
        System.out.println(Arrays.toString(solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25}))); // [1, 6]
        System.out.println(Arrays.toString(solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35}))); // [1, 1]
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0, collectCount = 0;
        Map<Integer, Integer> map = new HashMap<>() {{
            put(0, 6); put(1, 6); put(2, 5); put(3, 4);
            put(4, 3); put(5, 2); put(6, 1);
        }};

        for (int lotto : lottos) {
            if (lotto == 0) zeroCount++;
            if (isExist(lotto, win_nums)) collectCount++;
        }

        return new int[] {map.get(collectCount + zeroCount), map.get(collectCount)};
    }

    public static boolean isExist(int num, int[] array) {
        for (int arr : array)
            if (arr == num)
                return true;
        return false;
    }
}
