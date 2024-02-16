import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 열 단위로 반복하여 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-in-column/description
 * 2. 풀이핵심
 *  - 일반적인 순서로 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(n + 1);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}