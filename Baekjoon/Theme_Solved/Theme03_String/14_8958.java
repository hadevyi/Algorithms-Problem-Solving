import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : OX퀴즈
 *  - 번호 : 8958
 *  - 링크 : https://www.acmicpc.net/problem/8958
 *  2. 풀이핵심
 *  - 조건에 알맞게 계산하기
 * 3. 풀이후기
 *  - 연속으로 나오는 경우를 확인/초기화해서 중첩
 */
public class Main {
    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++) {
            char[] charArr = br.readLine().toCharArray();
            int Len = charArr.length;
            int result = 0, count = 0;

            for (int len = 0;len < Len;len++) {
                if (charArr[len] == 'X') {
                    count = 0;
                    continue;
                }

                result += ++count;
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}