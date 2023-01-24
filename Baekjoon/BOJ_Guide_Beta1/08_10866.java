import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 덱
 *  - 번호 : 10866
 *  - 링크 : https://www.acmicpc.net/problem/10866
 *  2. 풀이핵심
 *  - deque의 특성을 파악해서 진행함
 * 3. 풀이후기
 *  - deque는 앞뒤로 모두 넣고 뺄 수 있기에 같은 함수라도 first/last를 잘 구별해야함
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        Deque<Integer> deque = new LinkedList<>();

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front" :
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollFirst()).append("\n");
                    break;
                case "pop_back" :
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.pollLast()).append("\n");
                    break;
                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.peekFirst()).append("\n");
                    break;
                case "back" :
                    if (deque.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}
