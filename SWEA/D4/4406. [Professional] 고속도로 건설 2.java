import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4406. [Professional] 고속도로 건설 2
 *  2. 풀이핵심
 *  - unionfind 활용 문제
 * 3. 풀이후기
 *  - 아이디어 싸움이지만 시작점을 모르는 경우 최적의 풀이인것같다.
 */
public class Solution {

    public static int T, N, M;
    public static int[] parents;

    public static PriorityQueue<Edge> edges;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine()); // 도시의 수
            M = Integer.parseInt(br.readLine()); // 도로 후보 수
            parents = new int[N + 1];
            edges = new PriorityQueue<>();
            initSet();

            for (int m = 0;m < M;m++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                edges.offer(new Edge(s, e, c));
            }

            int result = 0, count = 0;
            for (int m = 0;m < M;m++) {
                Edge edge = edges.poll();
                if (checkSet(edge.start, edge.end)) {
                    result += edge.cost;
                    if (++count == N - 1) break;
                }
            }

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void initSet() {
        for (int n = 0;n <= N;n++)
            parents[n] = n;
    }

    public static int findSet(int num) {
        if (parents[num] == num) return num;
        return parents[num] = findSet(parents[num]);
    }

    public static boolean checkSet(int num1, int num2) {
        int oneRoot = findSet(num1);
        int twoRoot = findSet(num2);

        if (oneRoot == twoRoot)
            return false;

        if (oneRoot < twoRoot) parents[twoRoot] = findSet(num1);
        else parents[oneRoot] = findSet(num2);

        return true;
    }

    public static class Edge implements Comparable<Edge> {
        int start, end, cost;
        public Edge(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
