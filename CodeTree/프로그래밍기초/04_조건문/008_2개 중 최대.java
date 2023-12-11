import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2개 중 최대
 *  - 링크 : https://www.codetree.ai/missions/4/problems/max-of-two-nums/description
 * 2. 풀이핵심
 *  - 삼항연산자
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a > b ? a : b);
    }
}