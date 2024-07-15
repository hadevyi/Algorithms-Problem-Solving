import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자 교체하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/changing-char/description
 * 2. 풀이핵심
 *  - 문자 수정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] chList1 = st.nextToken().toCharArray(), chList2 = st.nextToken().toCharArray();
        chList2[0] = chList1[0];
        chList2[1] = chList1[1];

        StringBuffer sb = new StringBuffer();
        for (char ch : chList2)
            sb.append(ch);

        System.out.println(sb.toString());
    }
}