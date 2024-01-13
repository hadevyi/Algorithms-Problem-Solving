import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 100부터 입력받는 수까지의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-the-number-input-from-100/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), result = 0;
        for (int n = N;n <= 100;n++) result += n;
        System.out.println(result);
    }
}