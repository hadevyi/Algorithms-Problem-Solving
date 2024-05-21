import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 큐
 *  - 번호 : 10845
 *  - 링크 : https://www.acmicpc.net/problem/10845
 *  2. 풀이핵심
 *  - Queue Method를 이해하고 구현하기
 * 3. 풀이후기
 *  - stack과의 차이점을 확인하면서 진행하였음
 */
public class Main {

    static int lastNum;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push" :
                    lastNum = Integer.parseInt(st.nextToken());
                    queue.offer(lastNum);
                    break;
                case "pop" :
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case "back" :
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(lastNum).append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
