import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : Java vs C++
 *  - 번호 : 3613
 *  - 링크 : https://www.acmicpc.net/problem/3613
 *  2. 풀이핵심
 *  - 예외 조건을 찾아서 이를 조건식으로 구성해야 함
 * 3. 풀이후기
 *  - 모든 예외 조건을 찾는 것이 어려웠음.
 *  - 예상치 못한 다양한 내용들이 있었기에, 가능한 경우의 수를 모두 확인해야할 것 같음
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean isSpace = str.contains(" ");
        boolean lastFail = str.charAt(str.length() - 1) == '_';
        boolean startFail = str.substring(0, 1).matches(".*[A-Z].*") || str.substring(0, 1).equals("_");
        boolean doubleUnderBar = str.contains("__");
        boolean upperCaseAndUnder = str.contains("_") && str.matches(".*[A-Z].*");

        if (isSpace || lastFail || startFail || doubleUnderBar || upperCaseAndUnder) {
            System.out.println("Error");
        } else if (str.contains("_")) {
            System.out.println(cPlusToJava(str));
        } else {
            System.out.println(javaToCPlus(str));
        }
    }

    /**
     * 1. C++ 변수명 표현 조건
     *  - 소문자로만 구성
     *  - _로 단어 구별
     * 2. Java 변수명 표현 조건
     *  - 대소문자로 구성
     *  - _이 없음
     * 3. 모두 성립하지 않는 Error 경우
     *  - 공백이 있는 경우
     *  - 마지막이 _로 끝나는 경우
     *  - 대문자랑 _가 같이 있는 경우
     *  - _가 2번 연속으로 나오는 경우
     *  - 첫 글자가 대문자 혹은 _로 시작하는 경우
     */

    public static String javaToCPlus(String variableName) {
        StringBuffer sb = new StringBuffer();
        int LEN = variableName.length();

        for (int len = 0;len < LEN;len++) {
            char ch = variableName.charAt(len);

            if ('A' <= ch && ch <= 'Z') sb.append("_").append((char) (ch + ('a' - 'A')));
            else sb.append(ch);
        }

        return sb.toString();
    }

    public static String cPlusToJava(String variableName) {
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(variableName, "_");
        int LEN = st.countTokens();

        for (int len = 0;len < LEN;len++) {
            String str = st.nextToken();

            if (len == 0) sb.append(str);
            else {
                char ch = str.charAt(0);
                sb.append((char)(ch - ('a' - 'A'))).append(str.substring(1, str.length()));
            }
        }

        return sb.toString();
    }
}