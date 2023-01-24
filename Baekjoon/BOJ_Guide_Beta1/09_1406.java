import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 에디터
 *  - 번호 : 1406
 *  - 링크 : https://www.acmicpc.net/problem/1406
 *  2. 풀이핵심
 *  - 최대 60000글자까지 입력가능한 내용이고 시간 제한이 0.3이기에 빠른 방법을 활용해야 함
 * 3. 풀이후기
 *  - stackLeft에 남아있는 것이 있는지 확인해서 출력해야함
 */
public class Main {

    static Stack<Character> stackLeft, stackRight;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        stackLeft = new Stack<>(); // 왼쪽
        stackRight = new Stack<>(); // 오른쪽

        for (int i = 0;i < str.length();i++)
            stackLeft.add(str.charAt(i));

        int N = Integer.parseInt(br.readLine());
        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L" :
                    if (!stackLeft.isEmpty()) stackRight.push(stackLeft.pop());
                    break;
                case "D" :
                    if (!stackRight.isEmpty()) stackLeft.push(stackRight.pop());
                    break;
                case "B" :
                    if (!stackLeft.isEmpty()) stackLeft.pop();
                    break;
                case "P" :
                    stackLeft.push(st.nextToken().charAt(0));
                    break;
            }
        }

        while (!stackLeft.isEmpty())
            stackRight.push(stackLeft.pop());

        StringBuffer sb = new StringBuffer();
        while(!stackRight.isEmpty())
            sb.append(stackRight.pop());

        System.out.println(sb.toString());
    }
}
