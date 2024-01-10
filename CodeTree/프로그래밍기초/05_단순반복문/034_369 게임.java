import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 369 게임
 *  - 링크 : https://www.codetree.ai/missions/4/problems/369-game/description
 * 2. 풀이핵심
 *  - 조건 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            String str = Integer.toString(n);

            if (n % 3 == 0 || str.contains("3") || str.contains("6") || str.contains("9"))
                sb.append(0);
            else 
                sb.append(n);
            
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}