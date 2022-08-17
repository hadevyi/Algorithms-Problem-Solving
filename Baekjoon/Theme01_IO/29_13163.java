import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 닉네임에 갓 붙이기
 *  - 번호 : 13163
 *  - 링크 : https://www.acmicpc.net/problem/13163
 * 2. 풀이핵심
 *  - 음절단위 편집 풀기
 * 3. 풀이후기
 *  - 간단한 조건과 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0;i < N;i++){
            st = new StringTokenizer(br.readLine());
            int len = st.countTokens();

            for (int l = 0;l < len;l++) {
                String str = st.nextToken();
                if (l == 0) sb.append("god");
                else sb.append(str);
            }

            if (i < N - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}