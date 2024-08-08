import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 붙여서 합하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/add-and-add/description
 * 2. 풀이핵심
 *  - 문자열을 정수로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken(), B = st.nextToken();
        System.out.println(Integer.parseInt(A + B) + Integer.parseInt(B + A));
    }
}