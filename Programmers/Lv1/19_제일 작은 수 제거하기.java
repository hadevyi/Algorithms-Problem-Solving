import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 제일 작은 수 제거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12935
 *  2. 풀이핵심
 *  - 최소값을 찾아서 진행
 * 3. 풀이후기
 *  - 최소값이 여러개가 있을 수 있다는 전재하에 진행하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {4, 3, 2, 1}))); // [4, 3, 2]
        System.out.println(Arrays.toString(solution(new int[] {10}))); // [-1]
    }

    public static int[] solution(int[] arr) {
        int MIN = Integer.MAX_VALUE;
        for (int data : arr)
            MIN = Math.min(data, MIN);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int data : arr)
            if (data != MIN)
                arrayList.add(data);

        int N = arrayList.size(), idx = 0;
        if (N == 0) return new int[] {-1};

        int[] array = new int[N];
        for (int data : arrayList)
            array[idx++] = data;

        return array;
    }
}
