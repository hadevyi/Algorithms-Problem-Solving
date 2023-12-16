import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 시력 검사
 *  - 링크 : https://www.codetree.ai/missions/4/problems/eye-test/description
 * 2. 풀이핵심
 *  - 복합 조건
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double left = Double.parseDouble(br.readLine());
        double right = Double.parseDouble(br.readLine());

        String result = null;
        if (left >= 1.0 && right >= 1.0) result = "High";
        else if (left >= 0.5 && right >= 0.5) result = "Middle";
        else result = "Low";

        System.out.println(result);
    }
}