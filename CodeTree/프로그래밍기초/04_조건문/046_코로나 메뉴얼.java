import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 코로나 메뉴얼
 *  - 링크 : https://www.codetree.ai/missions/4/problems/covid-manual/description
 * 2. 풀이핵심
 *  - 조건문-반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int resultCount = 0;

        for (int n = 0;n < 3;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char isCold = st.nextToken().charAt(0);
            int fever = Integer.parseInt(st.nextToken());

            if (isCold == 'Y' && fever >= 37) resultCount++;
        }

        System.out.println(resultCount >= 2 ? 'E' : 'N');
    }
}