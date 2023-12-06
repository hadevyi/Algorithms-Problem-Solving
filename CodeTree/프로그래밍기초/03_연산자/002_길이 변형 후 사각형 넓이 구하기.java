import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 길이 변형 후 사각형 넓이 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/square-width-after-length-change/description
 * 2. 풀이핵심
 *  - 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken()) + 8;
        int height = Integer.parseInt(st.nextToken()) * 3;
        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);
    }
}