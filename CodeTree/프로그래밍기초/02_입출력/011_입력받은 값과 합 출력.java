import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 입력받은 값과 합 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/output-of-value-and-sum/description
 *  2. 풀이핵심
 *  - 공백이 있는 값 처리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a + " " + b + " " + (a + b));
    }
}