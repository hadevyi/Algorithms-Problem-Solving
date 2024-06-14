import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 짧은 문자열
 *  - 링크 : https://www.codetree.ai/missions/4/problems/shortest-string/description
 * 2. 풀이핵심
 *  - 공백없는 문자열 입력받아 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int n = 0;n < 3;n++) {
            int len = br.readLine().length();
            max = Math.max(max, len);
            min = Math.min(min, len);
        }

        System.out.println(max - min);
    }
}