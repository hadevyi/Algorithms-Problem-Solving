import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1989. 초심자의 회문 검사
 *  2. 풀이핵심
 *  - 반복문 변수 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            char[] chList = br.readLine().toCharArray();
            boolean isPalindrome = true;

            for (int s = 0, e = chList.length - 1;s <= e;s++, e--) {
                if (chList[s] != chList[e]) {
                    isPalindrome = false;
                    break;
                }
            }

            sb.append(isPalindrome ? 1 : 0);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
