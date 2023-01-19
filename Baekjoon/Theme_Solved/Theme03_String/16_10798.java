import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 세로 읽기
 *  - 번호 : 10798
 *  - 링크 : https://www.acmicpc.net/problem/10798
 *  2. 풀이핵심
 *  - 조건에 대한 구현
 *  - 세로읽기라는 String 확인 과정 구현
 * 3. 풀이후기
 *  - 현재 String을 확인하며 조건에 알맞지 않는다면, 다음 스트링의 동일 인덱스를 확인해야한다.
 *  - 하지만, 다음 스트링이 아닌 아예 다음 인덱스를 확인해 원하는 결과를 얻지 못했다.
 *  - break가 아닌 continue로 변경해 생각한 구현을 완성하였다.
 */
public class Main {
    static int N = 5;
    static String[] list = new String[N];

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int maxLen = 0;

        for (int n = 0;n < N;n++) {
            list[n] = br.readLine();
            maxLen = Integer.max(maxLen, list[n].length());
        }

        for (int len = 0;len < maxLen;len++) {
            for (int n = 0;n < N;n++) {
                int nowLen = list[n].length();

                // 긴 길이보다 현재 문자열의 길이가 짧다면, 다음을 확인
                if (nowLen < (len + 1)) continue;

                // 아니라면 순서대로 버퍼에 넣기
                sb.append(list[n].charAt(len));
            }
        }

        System.out.println(sb.toString());
    }
}
