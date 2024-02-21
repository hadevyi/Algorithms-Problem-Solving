import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좌우반전시킨 정사각형
 *  - 링크 : https://www.codetree.ai/missions/4/problems/left-right-inverted-square/description
 * 2. 풀이핵심
 *  - 수학적 규칙에 따라 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append((n + 1) * (N - m)).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}