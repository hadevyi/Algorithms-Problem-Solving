import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 점수 비교
 *  - 링크 : https://www.codetree.ai/missions/4/problems/score-comparison/description
 * 2. 풀이핵심
 *  - 복합 조건
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mathA = Integer.parseInt(st.nextToken());
        int engA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int mathB = Integer.parseInt(st.nextToken());
        int engB = Integer.parseInt(st.nextToken());

        System.out.println(mathA > mathB && engA > engB ? 1 : 0);
    }
}