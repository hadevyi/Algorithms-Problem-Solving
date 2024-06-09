import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열의 길이 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string's-range/description
 * 2. 풀이핵심
 *  - 공백없는 문자열 입력받아 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        for (int n = 0;n < 2;n++)
            result += br.readLine().length();
        System.out.println(result);
    }
}