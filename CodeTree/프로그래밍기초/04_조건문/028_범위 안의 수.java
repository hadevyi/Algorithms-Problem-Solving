import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 범위 안의 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-in-range/description
 * 2. 풀이핵심
 *  - 복합 조건
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(10 <= a && a <= 20 ? "yes" : "no");
    }
}