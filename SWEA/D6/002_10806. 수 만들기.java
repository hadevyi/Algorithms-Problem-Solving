import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10806. 수 만들기
 *  2. 풀이핵심
 *  - 최소횟수 카운팅을 위한 몫과 나머지
 * 3. 풀이후기
 *  - 이해가 되면서도 안되는 어려운 문제다...
 */
public class Solution {

    public static int T, N, K, X, D;
    public static int[] number;
    public static boolean[] isVisited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            number = new int[N];
            pq = new PriorityQueue<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                number[n] = Integer.parseInt(st.nextToken());

            K = Integer.parseInt(br.readLine());

            sb.append(bfs());
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static PriorityQueue<Data> pq;
    public static int bfs() {
        pq = new PriorityQueue<>();
        pq.offer(new Data(K, 0));

        while (!pq.isEmpty()) {
            Data data = pq.poll();

            if (data.data == 0) return data.count;

            pq.offer(new Data(0, data.data + data.count));
            for (int num : number)
                pq.offer(new Data(data.data / num, data.count + data.data % num));
        }

        return -1;
    }

    public static class Data implements Comparable<Data> {
        int data, count;
        public Data(int data, int count) {
            this.data = data;
            this.count = count;
        }
        @Override
        public int compareTo(Data o) {
            return this.count - o.count;
        }
    }
}
