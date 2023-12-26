import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1부터 n까지 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-from-1-to-n/description
 * 2. 풀이핵심
 *  - 간단한 반복문
 * 3. 풀이후기
 *  - 출력하기 위해 StringBuffer를 활용했다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int n = 1;n <= num;n++) sb.append(n).append(" ");
        System.out.println(sb.toString());
    }
}