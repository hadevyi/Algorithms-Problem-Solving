import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 위치의 문자 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/char-in-specific-location-2/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static String[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new String[N];
        for (int n = 0;n < N;n++)
            ARR[n] = st.nextToken();

        String result = String.join(" ", ARR[1], ARR[4], ARR[7]);
        System.out.println(result);
    }
}