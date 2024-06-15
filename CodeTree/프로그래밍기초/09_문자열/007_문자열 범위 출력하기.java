import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 범위 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string-in-range/description
 * 2. 풀이핵심
 *  - 공백있는 문자열 한번에 입력받기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().substring(2, 10));
    }
}