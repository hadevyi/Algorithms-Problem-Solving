import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 둘 중 하나의 배수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiple-of-either/description
 * 2. 풀이핵심
 *  - 복합조건 or로 연결하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a % 3 == 0 || a % 5 == 0 ? 1 : 0);
    }
}