import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 에디터
 *  - 번호 : 1406
 *  - 링크 : https://www.acmicpc.net/problem/1406
 *  2. 풀이핵심
 *  - 제한된 속도안에 맞춰서 구현하는 점을 확인해야 함
 * 3. 풀이후기
 *  - linkedlist로 풀이를 했다가 시간초과가 발생하였다.
 *  - 총 길이 최대 600,000에 명령어 최대 500,000인 경우 최악의 상황일때 답도 없는 것...
 *  - 가장 마지막에 stack while이 마음에 들진 않지만, 더욱 빠르게 진행할 방법은 찾아봐야할 것같다.
 */
public class Main {

    /**
     * L    커서를 왼쪽으로 한칸 (맨앞이면 무시)
     * D    커서를 오른쪽으로 한칸 (맨뒤면 무시)
     * B    커서 왼쪽에 문자 삭제 (맨앞이면 무시)
     * P $  $라는 문자를 커서 왼쪽에 추가함
     */

    static Stack<Character> stackResult, stackTemp;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stackResult = new Stack<Character>();
        stackTemp = new Stack<Character>();

        char[] charList = br.readLine().toCharArray();

        for (char ch : charList)
            stackResult.push(ch);

        int M = Integer.parseInt(br.readLine());

        for (int m = 0;m < M;m++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("L")) {
                if(stackResult.isEmpty()) continue;
                stackTemp.push(stackResult.pop());
            } else if (command.equals("D")) {
                if(stackTemp.isEmpty()) continue;;
                stackResult.push(stackTemp.pop());
            } else if (command.equals("B")) {
                if (stackResult.isEmpty()) continue;
                stackResult.pop();
            } else if (command.equals("P")) {
                stackResult.push(st.nextToken().charAt(0));
            }
        }

        while (!stackResult.isEmpty())
            stackTemp.push(stackResult.pop());

        StringBuffer sb = new StringBuffer();
        while(!stackTemp.isEmpty()) sb.append(stackTemp.pop());
        System.out.println(sb.toString());
    }
}
