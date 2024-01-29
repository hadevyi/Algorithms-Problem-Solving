import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 별표 출력하기 5
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-star-5/description
 * 2. 풀이핵심
 *  - 별찍기 연습하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = N;n > 0;n--) {
            String star = getStar(n);
            for (int m = 0;m < n;m++)
                sb.append(star).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static String getStar(int N) {
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) sb.append("*");
        return sb.toString();
    }
}