import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최대 2번의 연산
 *  - 링크 : https://www.codetree.ai/missions/4/problems/up-to-2-calculations/description
 * 2. 풀이핵심
 *  - 2개의 if
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 0) a = a / 2;
        if (a % 2 != 0) a = (a + 1) / 2;

        System.out.println(a);
    }
}