import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 일치하는 문자열의 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/num-of-correct-string/description
 * 2. 풀이핵심
 *  - 문자열 비교
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static String A;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        A = st.nextToken();

        int count = 0;
        for (int n = 0;n < N;n++) {
            if (!A.equals(br.readLine())) continue;
            count++;
        }

        System.out.println(count);
    }
}