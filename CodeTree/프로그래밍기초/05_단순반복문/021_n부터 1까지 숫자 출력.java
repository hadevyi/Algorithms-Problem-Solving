import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n부터 1까지 숫자 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-n-to-1/description
 * 2. 풀이핵심
 *  - 감소 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int num = n;num >= 1;num--)
            sb.append(num).append(" ");
        System.out.println(sb.toString());            
    }
}