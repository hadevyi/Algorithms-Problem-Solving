import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 14555. 공과 잡초
 *  2. 풀이핵심
 *  - 카운팅
 * 3. 풀이후기
 *  - 적절한 조건에 따른 카운팅
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int result = 0;
            char[] chList = br.readLine().toCharArray();

            for (int i = 0;i < chList.length;i++) {
                if (chList[i] == '.' || chList[i] == '|') continue;
                if (chList[i] == '(') {
                    result++;
                    i++;
                } else {
                    result++;
                }
            }

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}