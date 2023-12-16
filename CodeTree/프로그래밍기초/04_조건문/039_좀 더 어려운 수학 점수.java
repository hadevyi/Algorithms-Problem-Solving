import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좀 더 어려운 수학 점수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/math-scores-are-more-difficult/description
 * 2. 풀이핵심
 *  - 복합 연산자 활용
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

        String result = null;
        if (mathA == mathB) {
            result = engA > engB ? "A" : "B";
        } else {
            result = mathA > mathB ? "A" : "B";
        }

        System.out.println(result);
    }
}