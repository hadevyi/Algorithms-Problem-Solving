import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 공백을 기준으로 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/output-based-on-space/description
 * 2. 풀이핵심
 *  - 공백있는 문자열 한번에 입력받기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < 2;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) 
                sb.append(st.nextToken());
        }
        System.out.println(sb.toString());
    }
}