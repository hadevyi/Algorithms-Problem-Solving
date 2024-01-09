import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n번 더하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/add-n-times/description
 * 2. 풀이핵심
 *  - 반복 출력
 * 3. 풀이후기
 *  - 간단만 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        for (int reap = 0;reap < b;reap++) {
            a += b;
            sb.append(a).append("\n");
        }
        System.out.println(sb.toString());
    }
}