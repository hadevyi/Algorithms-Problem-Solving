import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 사각형의 넓이 계속 계산하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/continue-calculating-width-of-the-rectangle/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int heigth = Integer.parseInt(st.nextToken());
            char option = st.nextToken().charAt(0);

            sb.append(width * heigth).append("\n");

            if (option == 'C') break;
        }

        System.out.println(sb.toString());
    }
}