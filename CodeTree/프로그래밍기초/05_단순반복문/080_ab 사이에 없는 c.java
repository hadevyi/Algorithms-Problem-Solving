import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : ab 사이에 없는 c
 *  - 링크 : https://www.codetree.ai/missions/4/problems/c-between-a-and-b-2/description
 * 2. 풀이핵심
 *  - 조건 충족 확인
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean isExist = false;

        for (int n = a;n <= b;n++) {
            if (n % c == 0) {
                isExist = true;
                break;
            }
        }

        System.out.println(isExist ? "NO" : "YES");
    }
}