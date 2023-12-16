import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 숫자의 짝홀 여부
 *  - 링크 : https://www.codetree.ai/missions/4/problems/parity-of-two-numbers/description
 * 2. 풀이핵심
 *  - 
 * 3. 풀이후기
 *  - 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a % 2 == 0 ? "even" : "odd");
        System.out.println(b % 2 == 0 ? "even" : "odd");
    }
}