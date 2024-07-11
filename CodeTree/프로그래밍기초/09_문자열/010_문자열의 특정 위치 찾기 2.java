import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열의 특정 위치 찾기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-specific-location-in-spring-2/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 5;
    public static String[] ARR = { "apple", "banana", "grape", "blueberry", "orange" };
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);

        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            String str = ARR[n];
            if (str.charAt(2) != ch && str.charAt(3) != ch) continue;
            if (str.charAt(2) == ch) count++;
            if (str.charAt(3) == ch) count++;
            sb.append(str).append("\n");
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}