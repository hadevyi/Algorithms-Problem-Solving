import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 물의 상태
 *  - 링크 : https://www.codetree.ai/missions/4/problems/state-of-water/description
 * 2. 풀이핵심
 *  - if-else if-else 구문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int water = Integer.parseInt(br.readLine());

        String result = null;
        if (water < 0) result = "ice";
        else if (water >= 100) result = "vapor";
        else result = "water";

        System.out.println(result);
    }
}