import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 구구단 만들기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-multiplication-table-2/description
 * 2. 풀이핵심
 *  - 구구단
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int n = 2;n <= 8;n += 2) {
            StringBuffer temp = new StringBuffer();
            for (int m = b;m >= a;m--)
                temp.append(m).append(" * ").append(n).append(" = ").append(n * m).append(" / ");
            sb.append(temp.toString().substring(0, temp.length() - 2));
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}