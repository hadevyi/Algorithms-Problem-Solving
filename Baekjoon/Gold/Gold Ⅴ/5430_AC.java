import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : AC
 *  - 번호 : 5430
 *  - 링크 : https://www.acmicpc.net/problem/5430
 *  2. 풀이핵심
 *  - 조건에 따른 구현, 양방향 queue를 활용하는 것이 편리함
 * 3. 풀이후기
 *  - 빈 배열을 출력하는 예외사항을 포함하지 않았음
 */
public class Main {

    public static int T; // 테스트 케이스 개수, 최대 100
    public static int N; // 배열에 들어있는 수의 개수
    public static boolean direction; // 방향 - true : 앞쪽, false : 뒷쪽
    public static Deque<Integer> deque; // 확인하기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 0;t < T;t++) {
            String p = br.readLine(); // 1 <= p.length() <= 100,000
            N = Integer.parseInt(br.readLine()); // 0 <= N <= 100,000
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str.substring(1, str.length() - 1), ",");

            direction = true;
            deque = new LinkedList<>();

            for (int n = 0;n < N;n++)
                deque.addLast(Integer.parseInt(st.nextToken()));

            StringBuffer tempSb = new StringBuffer();
            for (int i = 0;i < p.length();i++) {
                char ch = p.charAt(i);

                if (ch == 'R') direction = !direction;
                else if (ch == 'D') {
                    if (deque.isEmpty()) {
                        tempSb = new StringBuffer();
                        tempSb.append("error");
                        break;
                    }

                    if (direction) deque.pollFirst();
                    else deque.pollLast();
                }
            }

            if (!tempSb.toString().equals("error")) {
                tempSb = new StringBuffer();
                tempSb.append("[");
                if (direction)
                    while (!deque.isEmpty())
                        tempSb.append(deque.pollFirst()).append(",");
                else
                    while (!deque.isEmpty())
                        tempSb.append(deque.pollLast()).append(",");
                if (tempSb.length() > 2)
                    tempSb.deleteCharAt(tempSb.length() - 1);
                tempSb.append("]");
            }

            sb.append(tempSb.toString()).append("\n");
        }

        System.out.println(sb.toString());
    }
}
