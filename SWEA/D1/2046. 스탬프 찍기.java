import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 2046. 스탬프 찍기
 *  2. 풀이핵심
 *  - for문 사용하기
 * 3. 풀이후기
 *  - 간단한 반복문
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++)
            sb.append("#");

        System.out.println(sb.toString());
    }
}
