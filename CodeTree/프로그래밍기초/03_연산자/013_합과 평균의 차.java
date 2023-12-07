import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 합과 평균의 차
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sub-of-average-and-sum/description
 * 2. 풀이핵심
 *  - StringTokenizer와 연산
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sum = a + b + c;
        int avg = sum / 3;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(sum - avg);
    }
}