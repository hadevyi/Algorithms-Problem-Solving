import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 홀수만 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/output-only-odd/description
 * 2. 풀이핵심
 *  - 반복문과 StringBuffer 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int num = a;num <= b;num++) {
            if (num % 2 == 0) continue;
            sb.append(num).append(" ");
        }

        System.out.println(sb.toString());
    }
}