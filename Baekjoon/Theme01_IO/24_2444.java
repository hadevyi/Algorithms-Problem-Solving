import java.util.*;
import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 별 찍기 - 7
 *  - 번호 : 2444
 *  - 링크 : https://www.acmicpc.net/problem/2444
 * 2. 풀이핵심
 *  - 별찍기
 *  - 반복문 확인
 * 3. 풀이후기
 *  - 별찍기 기초 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0;i < T;i++){
            for (int j = 0;j < T - (i + 1);j++)
                sb.append(" ");
            for (int j = 0;j < (2 * (i + 1)) - 1;j++)
                sb.append("*");
            sb.append("\n");
        }

        for(int i = T - 1;i > 0;i--){
            for (int j = 0;j < T - i;j++)
                sb.append(" ");
            for (int j = 0;j < 2 * i - 1;j++)
                sb.append("*");
            if (i > 1)
                sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
