import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2의 거듭제곱수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/pow-of-2/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
        put(2, 1); put(4, 2); put(8, 3); put(16, 4); put(32, 5);
        put(64, 6); put(128, 7); put(256, 8); put(512, 9); put(1024, 10);
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(map.get(Integer.parseInt(br.readLine())));
    }
}