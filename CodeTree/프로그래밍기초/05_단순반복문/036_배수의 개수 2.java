import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배수의 개수 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-multipliers-2/description
 * 2. 풀이핵심
 *  - 조건 카운팅
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0;i < 10;i++) 
            if (Integer.parseInt(br.readLine()) % 2 != 0) count++;
        System.out.println(count);
    }
}