import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1231. [S/W 문제해결 기본] 9일차 - 중위순회
 *  2. 풀이핵심
 *  - Node를 선언하고 활용하기
 * 3. 풀이후기
 *  - tree를 직접구현하려고 했을때 너무 어려웠던 문제였다.
 */
public class tree01 {

    public static int T = 10, N;
    public static StringBuffer sb = new StringBuffer();
    public static Node[] nodes;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            nodes = new Node[N + 1];

            for (int n = 1;n <= N;n++)
                nodes[n] = new Node();

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int index = Integer.parseInt(st.nextToken());
                String data = st.nextToken();
                int leftIdx = 0, rightIdx = 0;
                if (st.countTokens() > 0) leftIdx = Integer.parseInt(st.nextToken());
                if (st.countTokens() > 0) rightIdx = Integer.parseInt(st.nextToken());

                nodes[index].data = data;
                if (leftIdx != 0) nodes[index].left = nodes[leftIdx];
                if (rightIdx != 0) nodes[index].right = nodes[rightIdx];
            }

            doInorder(nodes[1]);

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void doInorder(Node node) {
        if (node == null) return;

        doInorder(node.left);
        sb.append(node.data);
        doInorder(node.right);
    }

    public static class Node {
        String data;
        Node left, right;

        public Node() {
            this.data = null;
            this.left = null;
            this.right = null;
        }
    }
}
