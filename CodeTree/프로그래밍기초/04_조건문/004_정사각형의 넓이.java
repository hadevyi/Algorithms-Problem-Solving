import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정사각형의 넓이
 *  - 링크 : https://www.codetree.ai/missions/4/problems/area-of-a-rectangle/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n = n * n;

        System.out.println(n);

        if (Math.sqrt(n) < 5)
            System.out.println("tiny");
    }
}