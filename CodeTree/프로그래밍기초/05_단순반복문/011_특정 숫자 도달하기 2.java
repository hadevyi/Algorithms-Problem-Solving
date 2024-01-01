import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 숫자 도달하기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reaching-specific-number-2/description
 * 2. 풀이핵심
 *  - 감소 반복문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        for (int num = n;num > 0;num--)
            sb.append(num).append(" ");
        
        System.out.println(sb.toString());
    }
}