import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 등장횟수 확인
 *  - 링크 : https://www.codetree.ai/missions/4/problems/check-number-of-appearances/description
 * 2. 풀이핵심
 *  - 조건 카운팅
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        for (int i = 0;i < 5;i++)
            if (Integer.parseInt(br.readLine()) % 2 == 0)
                count++;
        
        System.out.println(count);
    }
}