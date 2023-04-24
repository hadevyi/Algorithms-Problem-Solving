import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 큰 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42746
 *  2. 풀이핵심
 *  - 문자열 비교
 * 3. 풀이후기
 *  - compareTo를 새로운 방법으로 비교해보았음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {

    }

    public static String solution(int[] numbers) {
        boolean zero = true;
        for (int num : numbers)
            if (num != 0) {
                zero = false;
                break;
            }
        if (zero) return "0";

        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            return (o2 + o1).compareTo(o1 + o2);
        });
        for (int num : numbers)
            pq.offer(Integer.toString(num));

        StringBuffer sb = new StringBuffer();
        while(!pq.isEmpty())
            sb.append(pq.poll());
        return sb.toString();
    }
}
