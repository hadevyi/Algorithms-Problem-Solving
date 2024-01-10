import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 증감
 *  - 링크 : https://www.codetree.ai/missions/4/problems/increasing-and-decreasing-numbers/description
 * 2. 풀이핵심
 *  - if와 for 활용하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char c = st.nextToken().charAt(0);
        int n = Integer.parseInt(st.nextToken());

        int startNum = c == 'A' ? 1 : n, endNum = c == 'A' ? n : 1, step = c == 'A' ? 1 : -1;
        StringBuffer sb = new StringBuffer();

        while (true) {
            sb.append(startNum).append(" ");
            startNum += step;

            if ((c == 'A' && startNum > endNum) || (c == 'D' && startNum < endNum))
                break;
        }

        System.out.println(sb.toString());
    }
}