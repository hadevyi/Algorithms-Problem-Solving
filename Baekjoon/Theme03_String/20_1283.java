import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단축키 지정
 *  - 번호 : 1283
 *  - 링크 : https://www.acmicpc.net/problem/1283
 *  2. 풀이핵심
 *  - 문자열의 조건을 구현하면서, 이전과 겹치지 않도록 확인함.
 * 3. 풀이후기
 *  - 조건마다 다르게 구현하면서 변수를 최소화할 수 있도록 고민하였음.
 */
public class Main {

    static int T, N = 26; // 총 입력받을 개수, 알파벳 개수
    static String[] strList; // 입력받은 문자열들
    static boolean[] alpha; // 단축키 지정 여부
    static StringBuffer sb = new StringBuffer(); // 출력할 버퍼

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        alpha = new boolean[N];
        strList = new String[T];

        for (int t = 0;t < T;t++) {
            strList[t] = br.readLine();
            // 단축키가 된 idx를 찾아오는 함수로 idx를 초기화
            int idx = checkChar(strList[t]);
            if (idx == -1) sb.append(strList[t]);
            else {
                // substring을 활용해 필요한 부분 앞뒤로는 그대로 가져오며, [] 기호를 추가함
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
        Len = str.length();
        for (int len = 1;len < Len;len++) {
            char ch = str.charAt(len);
            if (ch == ' ') {
                len++;
                continue;
            }

            ch = ('a' <= ch && ch <= 'z') ? ch : (char) (ch + ('a' - 'A'));
            if (!alpha[ch - 'a']) {
                alpha[ch-'a'] = true;
                return len;
            }
        }


        return -1;
    }
}
