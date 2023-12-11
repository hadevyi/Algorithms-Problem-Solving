import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 삼항연산자 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/ternary-operator-2/description
 * 2. 풀이핵심
 *  - 삼항연산자
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(a == 1 ? 't' : 'f');
    }
}