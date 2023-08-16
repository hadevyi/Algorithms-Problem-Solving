import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 7701. 염라대왕의 이름 정렬
 *  2. 풀이핵심
 *  - 간단한 Set, PQ 활용하기
 * 3. 풀이후기
 *  - 중복하면 안된다는 내용으로 인해 SET을 추가했다.
 */
public class Solution {

    public static int T, N;
    public static Set<String> set;
    public static PriorityQueue<Data> pq;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append("\n");
            pq = new PriorityQueue<Data>();
            set = new HashSet<>();

            N = Integer.parseInt(br.readLine());

            for (int n = 0;n < N;n++)
                set.add(br.readLine());

            for (String str : set)
                pq.offer(new Data(str));

            while (!pq.isEmpty())
                sb.append(pq.poll().str).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Data implements Comparable<Data> {
        String str;
        public Data(String str) {
            this.str = str;
        }
        @Override
        public int compareTo(Data o) {
            if (this.str.length() == o.str.length())
                return this.str.compareTo(o.str);
            return this.str.length() - o.str.length();
        }
    }
}
