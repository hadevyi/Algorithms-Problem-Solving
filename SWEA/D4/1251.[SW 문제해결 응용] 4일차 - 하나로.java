import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1251.[S/W 문제해결 응용] 4일차 - 하나로
 *  2. 풀이핵심
 *  - unionfind 문제로 진행함
 * 3. 풀이후기
 *  - 오랜만에 풀이한 unionfind 코드가 어색했었다. 그래도 곧 풀며 만족도가 높았던 문제
 */
public class Solution {

    public static class Node {
        int id, x, y;
        public Node(int id, int x) {
            this.id = id;
            this.x = x;
            this.y = 0;
        }
    }

    public static class Edge implements Comparable<Edge> {
        Node node1, node2;
        double length;
        public Edge(Node node1, Node node2) {
            this.node1 = node1;
            this.node2 = node2;
            double dy = Math.abs(node2.y - node1.y);
            double dx = Math.abs(node2.x - node1.x);
            this.length = dy * dy + dx * dx;
        }
        @Override
        public int compareTo(Edge o) {
            return Double.compare(this.length, o.length);
        }
    }

    public static int T, N;
    public static double E;
    public static Node[] nodes;
    public static int[] parents;
    public static PriorityQueue<Edge> edges;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            nodes = new Node[N];
            parents = new int[N];
            edges = new PriorityQueue<>();

            for (int n = 0;n < N;n++)
                parents[n] = n;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                nodes[n] = new Node(n, Integer.parseInt(st.nextToken()));

            st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                nodes[n].y = Integer.parseInt(st.nextToken());

            E = Double.parseDouble(br.readLine());

            for (int n = 0;n < N;n++)
                for (int m = n + 1;m < N;m++)
                    edges.add(new Edge(nodes[n], nodes[m]));

            int check = 0;
            double result = 0;
            while (!edges.isEmpty()) {
                Edge edge = edges.poll();
                if (unionSet(edge.node1.id, edge.node2.id)) {
                    result += edge.length;
                    if (++check == N - 1) break;
                }
            }

            sb.append(Math.round(result * E));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int findSet(int num) {
        if (parents[num] == num) return num;
        return parents[num] = findSet(parents[num]);
    }

    public static boolean unionSet(int id1, int id2) {
        int oneRoot = findSet(id1);
        int twoRoot = findSet(id2);

        if (oneRoot == twoRoot) return false;

        if (oneRoot < twoRoot) parents[twoRoot] = oneRoot;
        else parents[oneRoot] = twoRoot;

        return true;
    }
}
