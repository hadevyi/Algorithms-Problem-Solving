import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 구구단으로 이루어진 직각 삼각형
 *  - 링크 : https://www.codetree.ai/missions/4/problems/a-right-triangle-made-up-of-multiplication-tables/description
 * 2. 풀이핵심
 *  - 포맷에 맞춰 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            StringBuffer temp = new StringBuffer();
            for (int m = 1;m <= N - n + 1;m++)
                temp.append(n).append(" * ").append(m).append(" = ").append(n * m).append(" / ");
            String str = temp.toString().substring(0, temp.toString().length() - 2);
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}