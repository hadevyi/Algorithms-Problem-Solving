import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 시력 검사 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/eye-test-2/description
 * 2. 풀이핵심
 *  - if-else if-else 구문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(br.readLine());

        String result = null;
        if (number >= 1.0) result = "High";
        else if (number >= 0.5) result = "Middle";
        else result = "Low";

        System.out.println(result);
    }
}