import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 아스키코드 변환
 *  - 링크 : https://www.codetree.ai/missions/4/problems/convert-to-ascii/description
 * 2. 풀이핵심
 *  - 아스키 코드
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char ch = st.nextToken().charAt(0);
        int ascii = Integer.parseInt(st.nextToken());

        System.out.printf("%d %c", (int) ch, (char) ascii);
    }
}