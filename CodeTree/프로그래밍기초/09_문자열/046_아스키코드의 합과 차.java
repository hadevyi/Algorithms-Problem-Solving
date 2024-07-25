import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 아스키코드의 합과 차
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-and-subtract-in-ASCII/description
 * 2. 풀이핵심
 *  - 아스키 코드
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = st.nextToken().charAt(0), two = st.nextToken().charAt(0);
        System.out.printf("%d %d", one + two, Math.max(one, two) - Math.min(one, two));
    }
}