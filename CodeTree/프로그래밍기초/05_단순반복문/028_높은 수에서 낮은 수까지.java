import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 높은 수에서 낮은 수까지
 *  - 링크 : https://www.codetree.ai/missions/4/problems/from-high-to-low/description
 * 2. 풀이핵심
 *  - if와 for 활용하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int num = Math.max(a, b);num >= Math.min(a, b);num--)
            sb.append(num).append(" ");
        System.out.println(sb.toString());
    }
}