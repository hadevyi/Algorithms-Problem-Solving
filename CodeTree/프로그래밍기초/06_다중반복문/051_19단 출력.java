import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 19단 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/nineteen-times-table/description
 * 2. 풀이핵심
 *  - 포맷에 맞춰 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    
    public static int N = 19;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            for (int m = 1;m <= N;m++) {
                sb.append(n).append(" * ").append(m).append(" = ").append(n * m);
                if (m != N && m % 2 != 0) sb.append(" / ");
                else sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}