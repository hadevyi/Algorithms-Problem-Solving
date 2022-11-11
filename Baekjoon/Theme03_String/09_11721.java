import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 열 개씩 끊어 출력하기
 *  - 번호 : 11721
 *  - 링크 : https://www.acmicpc.net/problem/11721
 *  2. 풀이핵심
 *  - String을 적절히 구별해 조건에 알맞게 출력하기
 * 3. 풀이후기
 *  - String을 char Array로 바꿔 index에 따라 진행
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        char[] list = br.readLine().toCharArray();
        int Len = list.length;

        for (int i = 0;i < Len;i++) {
            sb.append(list[i]);
            if ((i + 1) % 10 == 0) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}