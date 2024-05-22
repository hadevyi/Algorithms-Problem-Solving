import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 요다
 *  - 번호 : 5363
 *  - 링크 : https://www.acmicpc.net/problem/5363
 * 2. 풀이핵심
 *  - 각 조건에 따른 출력만들기
 * 3. 풀이후기
 *  - 조건에 따른 분기 생성 및 최대한 적절한 내용 사용하기
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        StringBuffer result = new StringBuffer();
        StringTokenizer st;

        for (int l = 0;l < line;l++) {
            StringBuffer temp = new StringBuffer();
            st = new StringTokenizer(br.readLine());
            int number = st.countTokens();

            for (int n = 0;n < number;n++) {
                if (n < 2) {
                    temp.append(st.nextToken());
                    if (n == 0) temp.append(" ");
                } else result.append(st.nextToken()).append(" ");
            }

            result.append(temp.toString());
            if (l < line - 1) result.append("\n");
        }

        System.out.println(result.toString());
    }
}