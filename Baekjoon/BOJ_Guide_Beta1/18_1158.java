import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 요세푸스 문제
 *  - 번호 : 1158
 *  - 링크 : https://www.acmicpc.net/problem/1158
 *  2. 풀이핵심
 *  - 순환식으로 진행하며 순서대로 제거하는 식
 * 3. 풀이후기
 *  - 로직과 원하는 모양대로 출력하는 것에 신경씀
 */
public class Main {

    public static int N, K;
    public static Queue<Integer> queue;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();

        for (int n = 1;n <= N;n++)
            queue.add(n);

        StringBuffer sb = new StringBuffer();
        sb.append("<");

        while (!queue.isEmpty()) {
            for (int k = 0;k < K;k++) {
                int num = queue.poll();

                if (k == K - 1) sb.append(num).append(", ");
                else queue.add(num);
            }
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb.toString());
    }
}
