import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1248. [S/W 문제해결 응용] 3일차 - 공통조상
 *  2. 풀이핵심
 *  - 재귀함수로 구현하는 과정
 * 3. 풀이후기
 *  - 최소한 한 함수의 모든 기능을 처리하려고 했는데, 마음에 드는 코드는 아니다.
 */
public class Solution {

    public static int[] FIND;
    public static int T, FIND_ANS, LEVEL;
    public static Node[] nodes;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeSize = Integer.parseInt(st.nextToken());
            int edgeSize = Integer.parseInt(st.nextToken());
            FIND = new int[2];
            FIND[0] = Integer.parseInt(st.nextToken());
            FIND[1] = Integer.parseInt(st.nextToken());
            nodes = new Node[nodeSize + 1];
            FIND_ANS = 0;
            LEVEL = 0;

            for (int n = 1;n <= nodeSize;n++)
                nodes[n] = new Node(n);

            st = new StringTokenizer(br.readLine());
            for (int e = 0;e < edgeSize;e++) {
                int p = Integer.parseInt(st.nextToken()); // 부모노드
                int c = Integer.parseInt(st.nextToken()); // 자식노드

                if (nodes[p].left == null) nodes[p].left = nodes[c];
                else if (nodes[p].left != null && nodes[p].right == null) nodes[p].right = nodes[c];
            }

            findCommandParent(nodes[1]);
            getSubTreeLevel(0, nodes[FIND_ANS]);

            sb.append(FIND_ANS).append(" ").append(LEVEL); // 가장 가까운 공통 조상, 해당 조상의 부트리의 레벨
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void getSubTreeLevel(int count, Node node) {
        LEVEL++;

        if (node.left == null && node.right == null) return;

        if (node.left != null) getSubTreeLevel(count + 1, node.left);
        if (node.right != null) getSubTreeLevel(count + 1, node.right);
    }

    public static boolean findCommandParent(Node node) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return isFind(node.data); // 리프노드

        boolean leftSubTreeCheck = findCommandParent(node.left);
        boolean rightSubTreeCheck = findCommandParent(node.right);

        if (leftSubTreeCheck && rightSubTreeCheck) {
            FIND_ANS = node.data;
        }

        return leftSubTreeCheck || isFind(node.data) || rightSubTreeCheck;
    }

    public static boolean isFind(int data) {
        for (int find : FIND)
            if (data == find)
                return true;
        return false;
    }

    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}