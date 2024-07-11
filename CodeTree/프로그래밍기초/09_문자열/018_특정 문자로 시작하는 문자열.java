import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 문자로 시작하는 문자열
 *  - 링크 : https://www.codetree.ai/missions/4/problems/strings-that-start-with-a-specific-character/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static String[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new String[N];

        for (int n = 0;n < N;n++) ARR[n] = br.readLine();
        char ch = br.readLine().charAt(0);

        int sum = 0, count = 0;
        for (String data : ARR) {
            if (data.charAt(0) != ch) continue;
            count++;
            sum += data.length();
        }

        System.out.printf("%d %.2f", count, (double) sum / count);
    }
}