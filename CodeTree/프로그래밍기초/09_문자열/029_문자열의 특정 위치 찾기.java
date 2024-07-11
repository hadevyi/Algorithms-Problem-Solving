import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열의 특정 위치 찾기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-specific-location-in-spring/description
 * 2. 풀이핵심
 *  - 문자열 찾기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char ch = st.nextToken().charAt(0);

        int findIdx = -1;
        for (int idx = 0;idx < str.length();idx++) {
            if (str.charAt(idx) != ch) continue;
            findIdx = idx;
            break;
        }

        System.out.println(findIdx == -1 ? "No" : findIdx);
    }
}