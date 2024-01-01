import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : b부터 a까지 감소
 *  - 링크 : https://www.codetree.ai/missions/4/problems/dec-from-b-to-a/description
 * 2. 풀이핵심
 *  - 감소 반복문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int num = b;num >= a;num--)
            sb.append(num).append(" ");

        System.out.println(sb.toString());
    }
}