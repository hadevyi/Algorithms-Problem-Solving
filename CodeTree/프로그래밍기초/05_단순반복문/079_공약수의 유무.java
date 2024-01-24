import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 공약수의 유무
 *  - 링크 : https://www.codetree.ai/missions/4/problems/presence-or-absence-of-a-common-divisor/description
 * 2. 풀이핵심
 *  - 조건을 만족하는 경우
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int NUM1 = 1920, NUM2 = 2880;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean isFind = false;

        for (int n = a;n <= b;n++) {
            if (NUM1 % n == 0 && NUM2 % n == 0) {
                isFind = true;
                break;
            }
        }

        System.out.println(isFind ? 1 : 0);
    }
}