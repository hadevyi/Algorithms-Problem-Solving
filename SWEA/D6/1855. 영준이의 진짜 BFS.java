import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1855. 영준이의 진짜 BFS
 *  2. 풀이핵심
 *  - LCA를 적용해보는 문제
 * 3. 풀이후기
 *  - LCA 중에서도 일반적인 풀이가 아닌 DP, 세그먼트 트리로 접근해야한 가능하다.
 */
public class Solution {
    public static int T, N, MAX_DEPTH = 20;
    public static int[][] DP;
    public static Node[] nodes;
    public static List<Node> path;

    public static class Node {
        int data, depth;
        List<Node> childs;
        public Node(int data) {
            this.data = data;
            this.depth = 0;
            this.childs = new ArrayList<>();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            // data init
            N = Integer.parseInt(br.readLine());
            nodes = new Node[N + 1];
            DP = new int[MAX_DEPTH + 1][N + 1];
            path = new ArrayList<>();

            for (int n = 0;n <= N;n++)
                nodes[n] = new Node(n);

            // child node connection
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 2;n <= N;n++) {
                Node parent = nodes[Integer.parseInt(st.nextToken())];
                Node child = nodes[n];
                parent.childs.add(child);
            }

            bfs(nodes[1]);  // bfs - create path and depth setting
            fillDP();       // DP fill
            
            long ANS = 0;
            for (int idx = 0;idx < path.size() - 1;idx++) {
                Node child1 = path.get(idx);
                Node child2 = path.get(idx + 1);
                Node commonParent = nodes[findLCA(child1, child2)];

                ANS += (child1.depth - commonParent.depth) + (child2.depth - commonParent.depth);
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void bfs(Node rootNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(rootNode);

        while (!queue.isEmpty()) {
            Node nowNode = queue.poll();
            path.add(nowNode);

            for (Node childNode : nowNode.childs) {
                childNode.depth = nowNode.depth + 1;
                DP[0][childNode.data] = nowNode.data;
                queue.offer(childNode);
            }
        }
    }

    public static void fillDP() {
        for (int depth = 1;depth <= MAX_DEPTH;depth++)
            for (int nodeIdx = 1;nodeIdx <= N;nodeIdx++)
                DP[depth][nodeIdx] = DP[depth - 1][DP[depth - 1][nodeIdx]];
    }

    public static int findLCA(Node node1, Node node2) {
        // node1 bigger then node2
        if (node1.depth < node2.depth) {
            Node temp = node1;
            node1 = node2;
            node2 = temp;
        }

        // depth equals
        for (int depth = MAX_DEPTH;depth >= 0;depth--) {
            int gap = node1.depth - node2.depth;
            if (gap >= (1 << depth))
                node1 = nodes[DP[depth][node1.data]];
        }

        if (node1.data == node2.data)
            return node1.data;

        // find common parent node direct child
        for (int depth = MAX_DEPTH;depth >= 0;depth--) {
            if (DP[depth][node1.data] != DP[depth][node2.data]) {
                node1 = nodes[DP[depth][node1.data]];
                node2 = nodes[DP[depth][node2.data]];
            }
        }

        return DP[0][node1.data];
    }
}
