import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어로 구분하기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/separate-words-with-words-2/description
 * 2. 풀이핵심
 *  - 문자열 리스트 관리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int count = 0;
        while (st.hasMoreTokens()) {
            count++;
            String str = st.nextToken();
            if (count % 2 == 0) continue;
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}