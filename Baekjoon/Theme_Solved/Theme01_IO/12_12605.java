import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : 단어순서 뒤집기
 *  - 번호 : 12605
 *  - 링크 : https://www.acmicpc.net/problem/12605
 * 2. 풀이핵심
 *  - 가장 나중에 입력된 단어가 가장 처음에 작성되어야하기에, FILO의 특징을 볼 수 있다.
 *  - 즉, Stack을 활용하면 좋은 문제이다.
 * 3. 풀이후기
 *  - 자료구조 Stack를 사용하는 것이 오랜만이라, push/pop의 함수도 어색했다.
 *  - 하지만, 설계했던 대로 첫 시도에 통과할 수 있어서 만족스러운 문제였다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int n = 0;n < N;n++) {
            sb.append("Case #").append(n+1).append(": ");
            st = new StringTokenizer(br.readLine());
            int len = st.countTokens();
            Stack<String> stack = new Stack<String>();

            for (int l = 0;l < len;l++)
                stack.push(st.nextToken());

            for (int l = 0;l < len;l++){
                sb.append(stack.pop());

                if (l < len - 1)
                    sb.append(" ");
            }

            if (n < N - 1)
                sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
