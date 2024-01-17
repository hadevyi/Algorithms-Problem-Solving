import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 숫자 맞추기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/catching-specific-number/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num < 25) sb.append("Higher");
            else if (num > 25) sb.append("Lower");
            else {
                sb.append("Good");
                break;
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}