import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 연속된 부분 수열의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/178870
 *  2. 풀이핵심
 *  - 투포인터를 활용해서 진행하는 방법
 * 3. 풀이후기
 *  - end가 끝에 도달했을 때의 모습을 잘 고려해야할 것같다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {

    }
    public static int[] solution(int[] sequence, int k) {
        int start = 0, end = 0, sum = sequence[0], N = sequence.length;
        PriorityQueue<Data> pq = new PriorityQueue<>();

        while (start <= end) {
            if (sum == k) pq.offer(new Data(start, end));

            if (end + 1 < N && sum <= k) sum += sequence[++end];
            else sum -= sequence[start++];
        }

        Data data = pq.poll();
        return new int[] {data.start, data.end};
    }

    public static class Data implements Comparable<Data> {
        int start;
        int end;
        int len;
        public Data(int start, int end) {
            this.start = start;
            this.end = end;
            this.len = end - start + 1;
        }
        @Override
        public int compareTo(Data o) {
            if (this.len == o.len)
                return this.start - o.start;
            return this.len - o.len;
        }
    }
}
