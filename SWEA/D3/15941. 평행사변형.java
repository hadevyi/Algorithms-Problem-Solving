import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 15941. 평행사변형
 *  2. 풀이핵심
 *  - 평행사변형 넓이 구하기 식
 * 3. 풀이후기
 *  - 간단한 사칙연산
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());
        
        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine());
            sb.append(N * N);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
