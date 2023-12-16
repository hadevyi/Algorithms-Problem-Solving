import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 조건 여부 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number's-condition-2/description
 * 2. 풀이핵심
 *  - 2개의 if
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a == 5) System.out.println("A");
        else if (a % 2 == 0) System.out.println("B");
    }
}