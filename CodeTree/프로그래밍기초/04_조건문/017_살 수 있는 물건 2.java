import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 살 수 있는 물건 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/things-able-to-buy-2/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        String result = null;
        if (money >= 3000) result = "book";
        else if (money >= 1000) result = "mask";
        else if (money >= 500) result = "pen";
        else result = "no";

        System.out.println(result);
    }
}