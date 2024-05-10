import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 999 또는 -999
 *  - 링크 : https://www.codetree.ai/missions/4/problems/999-or-999/description
 *  2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 999 || num == -999) break;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.printf("%d %d", max, min);
    }
}