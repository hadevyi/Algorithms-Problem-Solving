import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 계절은
 *  - 링크 : https://www.codetree.ai/missions/4/problems/season-of-num/description
 * 2. 풀이핵심
 *  - 복합 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month = Integer.parseInt(br.readLine());

        String result = null;
        if (3 <= month && month <= 5) result = "Spring";
        else if (6 <= month && month <= 8) result = "Summer";
        else if (9 <= month && month <= 11) result = "Fall";
        else result = "Winter";

        System.out.println(result);
    }
}