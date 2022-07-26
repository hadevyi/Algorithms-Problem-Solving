import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 사칙연산
 *  - 번호 : 10869
 *  - 링크 : https://www.acmicpc.net/problem/10869
 * 2. 풀이핵심
 *  - 간단한 입력에 따른 사칙연산
 *  - 조건에 따른 출력 모양
 * 3. 풀이후기
 *  - 이전보다 훨씬 가벼웠던 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        sb.append(n1+n2).append("\n");
        sb.append(n1-n2).append("\n");
        sb.append(n1*n2).append("\n");
        sb.append(n1/n2).append("\n");
        sb.append(n1%n2);
        System.out.println(sb.toString());
    }
}
