import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수 내림차순으로 배치하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12933
 *  2. 풀이핵심
 *  - 내용물을 구성한 후 정렬하기
 * 3. 풀이후기
 *  - Collection reverseOrder를 사용할 때는 int가 아닌 Integer를 사용해야한다는 것을 다시 한 번 상기하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(118372)); // 873211
    }

    public static long solution(long n) {
        Integer[] arr = new Integer[Long.toString(n).length()];
        StringBuffer sb = new StringBuffer();
        int idx = 0;

        for (char data : Long.toString(n).toCharArray())
            arr[idx++] = data - '0';

        Arrays.sort(arr, Collections.reverseOrder());
        for (int data : arr)
            sb.append(data);

        return Long.parseLong(sb.toString());
    }
}
