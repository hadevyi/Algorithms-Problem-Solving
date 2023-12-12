import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 살 수 있는 물건
 *  - 링크 : https://www.codetree.ai/missions/4/problems/things-able-to-buy/description
 * 2. 풀이핵심
 *  - if-else if-else 구문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        String result = null;
        if (money >= 3000) result = "book";
        else if (money >= 1000) result = "mask";
        else result = "no";

        System.out.println(result);
    }
}