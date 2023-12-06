import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 입력받아 출력2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/input-and-output-2/description
 * 2. 풀이핵심
 *  - StringTokenizer 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        System.out.println(st.nextToken() + st.nextToken());
    }
}