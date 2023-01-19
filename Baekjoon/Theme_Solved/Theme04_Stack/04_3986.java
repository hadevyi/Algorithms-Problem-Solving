import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좋은 단어
 *  - 번호 : 3986
 *  - 링크 : https://www.acmicpc.net/problem/3986
 *  2. 풀이핵심
 *  - 페어를 만드는데에 적절한 자료구조를 활용하면 됨.
 * 3. 풀이후기
 *  - 전체 횟수와 카운팅을 하는 변수를 구별해 진행함.
 */
public class Main {
    static int T, TOTAL;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;

        T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++) {
            stack = new Stack<>();
            char[] charList = br.readLine().toCharArray();
            int Len = charList.length;

            for (int len = 0;len < Len;len++) {
                if (!stack.isEmpty() && stack.peek().equals(charList[len])) stack.pop();
                else stack.push(charList[len]);
            }

            if (stack.isEmpty()) TOTAL++;
        }

        System.out.println(TOTAL);
    }
}
