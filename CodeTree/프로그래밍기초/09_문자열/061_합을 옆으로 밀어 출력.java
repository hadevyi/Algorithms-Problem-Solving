import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 합을 옆으로 밀어 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/push-the-sum-sideways-to-output/description
 * 2. 풀이핵심
 *  - 정수를 문자열로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int n = 0;n < N;n++) sum += Integer.parseInt(br.readLine());
        System.out.println(leftShift(Integer.toString(sum)));
    }

    private static String leftShift(String str) {
        return str.substring(1) + str.charAt(0);
    }
}