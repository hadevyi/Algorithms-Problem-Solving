import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 나누어 떨어지는 숫자 배열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12910
 *  2. 풀이핵심
 *  - 나누어 떨어지는 값 및 정렬
 * 3. 풀이후기
 *  - 해당 값이 없을 떈 -1 배열을 반환해야했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {5, 9, 7, 10}, 5))); // [5, 10];
        System.out.println(Arrays.toString(solution(new int[] {2, 36, 1, 3}, 1))); // [1, 2, 3, 36]
        System.out.println(Arrays.toString(solution(new int[] {3, 2, 6}, 10))); // [-1]
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int data : arr)
            if (data % divisor == 0)
                arrayList.add(data);


        int N = arrayList.size();
        if (N == 0) return new int[] {-1};

        int[] array = new int[N];
        int idx = 0;

        for (int data : arrayList)
            array[idx++] = data;

        Arrays.sort(array);
        return array;
    }
}
