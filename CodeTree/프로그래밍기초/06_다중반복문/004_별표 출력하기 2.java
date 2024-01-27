import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 별표 출력하기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-star-2/description
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
            for (int m = 0;m < n;m++)
                sb.append("*").append(" ");
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}