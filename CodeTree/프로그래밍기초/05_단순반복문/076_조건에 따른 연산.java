import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 조건에 따른 연산
 *  - 링크 : https://www.codetree.ai/missions/4/problems/operatino-by-rule/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), count = 0;

        while (true) {
            if (N >= 1000) break;
            N = N % 2 == 0 ? N * 3 + 1 : N * 2 + 2;
            count++;
        }

        System.out.println(count);
    }
}