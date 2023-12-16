import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 사람
 *  - 링크 : https://www.codetree.ai/missions/4/problems/two-person/description
 * 2. 풀이핵심
 *  - 복합 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ageA = Integer.parseInt(st.nextToken());
        char chA = st.nextToken().charAt(0);

        st = new StringTokenizer(br.readLine());
        int ageB = Integer.parseInt(st.nextToken());
        char chB = st.nextToken().charAt(0);

        System.out.println((ageA >= 19 && chA == 'M') || (ageB >= 19 && chB == 'M') ? 1 : 0);
    }
}