import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : LCA 2
 *  - 번호 : 11438
 *  - 링크 : https://www.acmicpc.net/problem/11438
 *  2. 풀이핵심
 *  - LCA 구현하기
 * 3. 풀이후기
 *  - LCA를 알면 간편하고, 아니면 못푸는 문제
 */
public class Main {
    public static class Node {
        int data, depth;
        List<Node> connect;
        public Node(int data) {
            this.data = data;
            this.depth = 0;
            this.connect = new ArrayList<>();
        }
    }

    public static int T, N, MAX_DEPTH = 20;
    public static int[][] DP;
    public static Node[] nodes;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        N = Integer.parseInt(br.readLine());
        nodes = new Node[N + 1];
        DP = new int[MAX_DEPTH + 1][N + 1];

        for (int n = 0;n <= N;n++)
            nodes[n] = new Node(n);

        // 연결 확인하기
        for (int n = 1;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Node node1 = nodes[Integer.parseInt(st.nextToken())];
            Node node2 = nodes[Integer.parseInt(st.nextToken())];

            node1.connect.add(node2);
            node2.connect.add(node1);
        }

        bfs(nodes[1]); // depth 설정하기
        fillDP();

        T = Integer.parseInt(br.readLine());
        for (int t = 0;t < T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Node node1 = nodes[Integer.parseInt(st.nextToken())];
            Node node2 = nodes[Integer.parseInt(st.nextToken())];
            sb.append(findLCA(node1, node2)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void bfs(Node rootNode) {
        boolean[] isVisited = new boolean[N + 1];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(rootNode);
        isVisited[rootNode.data] = true;

        while (!queue.isEmpty()) {
            Node nowNode = queue.poll();

            for (Node conNode : nowNode.connect) {
                if (isVisited[conNode.data]) continue;

                conNode.depth = nowNode.depth + 1;
                DP[0][conNode.data] = nowNode.data;
                isVisited[conNode.data] = true;
                queue.offer(conNode);
            }
        }
    }

    public static void fillDP() {
        for (int i = 1;i <= MAX_DEPTH;i++)
            for (int n = 1;n <= N;n++)
                DP[i][n] = DP[i - 1][DP[i - 1][n]];
    }

    public static int findLCA(Node node1, Node node2) {
        // node1이 큰 값이 되도록 교체
        if (node1.depth < node2.depth) {
            Node temp = node1;
            node1 = node2;
            node2 = temp;
        }

        // node1과 node2의 depth 조정하기
        for (int depth = MAX_DEPTH;depth >= 0;depth--) {
            int gap = node1.depth - node2.depth;
            if (gap >= (1 << depth)) {
                node1 = nodes[DP[depth][node1.data]];
            }
        }

        if (node1.data == node2.data)
            return node1.data;

        for (int depth = MAX_DEPTH;depth >= 0;depth--) {
            if (DP[depth][node1.data] != DP[depth][node2.data]) {
                node1 = nodes[DP[depth][node1.data]];
                node2 = nodes[DP[depth][node2.data]];
            }
        }

        return DP[0][node1.data];
    }
}
