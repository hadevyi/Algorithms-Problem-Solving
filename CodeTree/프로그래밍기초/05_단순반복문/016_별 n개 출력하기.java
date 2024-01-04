import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 별 n개 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-n-stars/description
 * 2. 풀이핵심
 *  - 증가 반복문
 * 3. 풀이후기
 *  - 간단만 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int num = 0;num < n;num++)
            sb.append("*\n");
        System.out.println(sb.toString());
    }
}