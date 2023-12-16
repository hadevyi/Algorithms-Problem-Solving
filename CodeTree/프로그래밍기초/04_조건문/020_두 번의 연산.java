import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 번의 연산
 *  - 링크 : https://www.codetree.ai/missions/4/problems/two-operations/description
 * 2. 풀이핵심
 *  - 2개의 if
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a % 2 != 0) a += 3;
        if (a % 3 == 0) a /= 3;

        System.out.println(a);
    }
}