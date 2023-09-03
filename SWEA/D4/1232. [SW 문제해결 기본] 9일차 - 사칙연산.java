import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1232. [S/W 문제해결 기본] 9일차 - 사칙연산
 *  2. 풀이핵심
 *  - 직전의 1233번 문제의 활용
 * 3. 풀이후기
 *  - 조금 더 간편해진 것 같다. 익숙해지니 쉽다.
 */
public class Solution {

    public static int T = 10;
    public static Node[] nodes;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine());
            nodes = new Node[N + 1]; // 0 dummy

            for (int n = 1;n <= N;n++)
                nodes[n] = new Node();

            for (int n = 1;n <= N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int index = Integer.parseInt(st.nextToken());
                String data = st.nextToken();
                int leftIdx = 0, rightIdx = 0;
                if (st.hasMoreTokens()) leftIdx = Integer.parseInt(st.nextToken());
                if (st.hasMoreTokens()) rightIdx = Integer.parseInt(st.nextToken());

                nodes[index].data = data;
                if (leftIdx != 0) nodes[index].left = nodes[leftIdx];
                if (rightIdx != 0) nodes[index].right = nodes[rightIdx];
            }

            sb.append((int)(getResultValue(nodes[1])));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static double getResultValue(Node node) {
        if (node.left == null && node.right == null) return (double) Integer.parseInt(node.data); // 리프노드

        double left = getResultValue(node.left);
        String op = node.data;
        double right = getResultValue(node.right);

        if (op.equals("+")) return left + right;
        else if (op.equals("-")) return left - right;
        else if (op.equals("*")) return left * right;
        return left / right;
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