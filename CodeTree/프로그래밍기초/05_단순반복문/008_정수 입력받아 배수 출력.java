import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수 입력받아 배수 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-multiple-of-input/description
 * 2. 풀이핵심
 *  - 반복문과 StringBuffer 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int num = n, count = 0;count < 5;num += n, count++)
            sb.append(num).append(" ");
        
        System.out.println(sb.toString());
    }
}