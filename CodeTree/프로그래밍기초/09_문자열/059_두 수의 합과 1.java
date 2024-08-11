import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 수의 합과 1
 *  - 링크 : https://www.codetree.ai/missions/4/problems/two-nums-sum-and-1/description
 * 2. 풀이핵심
 *  - 정수를 문자열로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        while (st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
        
        System.out.println(countOne(sum));
    }

    private static int countOne(int number) {
        int count = 0;
        for (char ch : Integer.toString(number).toCharArray()) {
            if (ch != '1') continue;
            count++;
        }
        return count;
    }
}