import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최빈값 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120812
 *  2. 풀이핵심
 *  - 최빈값을 확인해 값을 출력하기
 * 3. 풀이후기
 *  - 결과물로 최빈값 자체를 return 해서 실패를 했었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 3, 3, 4})); // 3
        System.out.println(solution(new int[] {1, 1, 2, 2})); // -1
        System.out.println(solution(new int[] {1})); // 1
    }

    public static int[] COUNT;
    public static int N = 1000;

    public static int solution(int[] array) {
        COUNT = new int[N];
        int max = Integer.MIN_VALUE;

        for (int n = 0;n < array.length;n++) {
            COUNT[array[n]]++;
            max = Math.max(COUNT[array[n]], max);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n = 0;n < N;n++)
            if (COUNT[n] == max)
                arrayList.add(n);

        return arrayList.size() > 1 ? -1 : arrayList.get(0);
    }
}
