import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝수 번째만 거꾸로 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-only-even-numbers-backwards/description
 * 2. 풀이핵심
 *  - 문자열 순회하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int c = 1;c < chArr.length;c += 2)
            sb.append(chArr[c]);
        System.out.println(sb.reverse());
    }
}