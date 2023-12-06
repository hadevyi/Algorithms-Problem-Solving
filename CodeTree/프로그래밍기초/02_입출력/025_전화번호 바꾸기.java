import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 전화번호 바꾸기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/change-phone-number/description
 * 2. 풀이핵심
 *  - StringTokenizer 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String pre = st.nextToken();
        String x = st.nextToken();
        String y = st.nextToken();
        System.out.println(pre + "-" + y + "-" + x);
    }
}