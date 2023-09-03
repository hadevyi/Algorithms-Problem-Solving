import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1233. [S/W 문제해결 기본] 9일차 - 사칙연산 유효성 검사
 *  2. 풀이핵심
 *  - 트리 구현
 * 3. 풀이후기
 *  - 아닌 조건들을 확인하는 것이 중요했다. stack으로도 풀수 있을 것같다.
 */
public class Solution {

    public static int T = 10, N;
    public static Node[] nodes;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            nodes = new Node[N + 1];

            for (int n = 0;n <= N;n++)
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

            sb.append(checkTree(nodes[1]) ? "1" : "0");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean checkTree(Node node) {
        if (node.left == null && node.right == null) return isNum(node.data); // 리프 노드인 경우
        if (node.right == null) return false; // 피연산자의 개수가 부족한 경우

        boolean leftCheck = checkTree(node.left);
        boolean rootCheck = !isNum(node.data);
        boolean rightCheck = checkTree(node.right);
        return leftCheck && rootCheck && rightCheck;
    }

    public static String[] opList = {"+", "-", "*", "/"};
    public static boolean isNum(String data) {
        for (String op : opList)
            if (data.equals(op))
                return false;
        return true;
    }

    public static class Node {
        String data;
        Node left, right;

        public Node() {
            data = null;
            left = null;
            right = null;
        }
    }
}
