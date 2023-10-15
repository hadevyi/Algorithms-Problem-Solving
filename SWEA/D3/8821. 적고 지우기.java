import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8821. 적고 지우기
 *  2. 풀이핵심
 *  - 존재 여부 확인
 * 3. 풀이후기
 *  - set을 이용해 간단하게 푼 문제이다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            Set<Character> set = new HashSet<>();
            char[] chArray = br.readLine().toCharArray();

            for (char ch : chArray) {
                if (set.contains(ch)) set.remove(ch);
                else set.add(ch);
            }

            sb.append(set.size());
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}