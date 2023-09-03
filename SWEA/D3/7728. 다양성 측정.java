import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 7728. 다양성 측정
 *  2. 풀이핵심
 *  - HashSet 활용하기
 * 3. 풀이후기
 *  - 중복을 없앤 종류 확인하기
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            Set<Character> set = new HashSet<>();
            char[] chList = br.readLine().toCharArray();

            for (char ch : chList)
                set.add(ch);

            sb.append(set.size());
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
