import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3n + 1 수열 m번
 *  - 링크 : https://www.codetree.ai/missions/4/problems/3n-plus-1-sequence-m-times/description
 * 2. 풀이핵심
 *  - n번 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            int startNumber = Integer.parseInt(br.readLine());
            sb.append(getCountToOne(startNumber)).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int getCountToOne(int num) {
        int count = 0;
        while (num != 1) {
            count++;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return count;
    }
}