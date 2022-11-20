import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 :
 *  - 번호 :
 *  - 링크 :
 *  2. 풀이핵심
 *  -
 * 3. 풀이후기
 *  -
 */
public class Main {

    static int T, N = 26; // 총 입력받을 개수, 알파벳 개수
    static String[] strList; // 입력받은 문자열들
    static boolean[] alpha; // 단축키 지정 여부
    static StringBuffer sb = new StringBuffer(); // 출력할 버퍼

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        alpha = new boolean[N];
        strList = new String[T];

        for (int t = 0;t < T;t++) {
            strList[t] = br.readLine();
            int idx = checkChar(strList[t]);
            if (idx == -1) sb.append(strList[t]);
            else {
                sb.append(strList[t].substring(0, idx)).append("[").append(strList[t].charAt(idx)).append("]");
                if (idx < strList[t].length() - 1) sb.append(strList[t].substring(idx + 1));
            }
            sb.append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }

    /**
     * 단축키 선정 조건
     * 1. 먼저 하나의 옵션에 대해 왼쪽에서부터 오른쪽 순서로 단어의 첫 글자가 이미 단축키로 지정되었는지 살펴본다.
     *    만약 단축키로 아직 지정이 안 되어있다면 그 알파벳을 단축키로 지정한다.
     * 2. 만약 모든 단어의 첫 글자가 이미 지정이 되어있다면 왼쪽에서부터 차례대로 알파벳을 보면서 단축키로 지정 안 된 것이 있다면 단축키로 지정한다.
     * 3. 어떠한 것도 단축키로 지정할 수 없다면 그냥 놔두며 대소문자를 구분치 않는다.
     * 4. 위의 규칙을 첫 번째 옵션부터 N번째 옵션까지 차례대로 적용한다.
     * */
    public static int checkChar(String str) {
        StringTokenizer st = new StringTokenizer(str);
        int Len = st.countTokens();
        int nowLen = 0;

        // 1번 조건 확인
        for (int len = 0;len < Len;len++) {
            String tempStr = st.nextToken();
            char ch = ('a' <= tempStr.charAt(0) && tempStr.charAt(0) <= 'z') ? tempStr.charAt(0) : (char) (tempStr.charAt(0) + ('a' - 'A'));
            if (alpha[ch - 'a']) {
                nowLen += tempStr.length() + 1;
                continue;
            } else {
                alpha[ch - 'a'] = true;
                return nowLen;
            }
        }

        // 2번 조건 확인


        return -1;
    }
}
