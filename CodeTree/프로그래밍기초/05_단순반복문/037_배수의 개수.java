import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배수의 개수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-multipliers/description
 * 2. 풀이핵심
 *  - 조건 카운팅
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countThree = 0, countFive = 0;
        for (int i = 0;i < 10;i++) {

            int num = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            if (num % 3 == 0) countThree++;
            if (num % 5 == 0) countFive++;
        }
        System.out.println(countThree + " " + countFive);
    }
}