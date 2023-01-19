import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수의 개수
 *  - 번호 : 10821
 *  - 링크 : https://www.acmicpc.net/problem/10821
 * 2. 풀이핵심
 *  - StringTokenizer 내용 확인
 * 3. 풀이후기
 *  - StringTokenizer를 적절하게 활용한 로직으로 짧지만 재미있었던 로직
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        int n = st.countTokens();
        int cnt = 0;

        for (int i = 0;i < n;i++) {
            String s = st.nextToken();
            if (!s.equals(",")) cnt++;
        }

        System.out.println(cnt);
    }
}