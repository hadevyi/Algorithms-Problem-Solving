import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2043. 서랍의 비밀번호
 *  2. 풀이핵심
 *  - 간단한 연산
 * 3. 풀이후기
 *  - 입력받은 내용에 대해 수식 정리하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int P = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.println(P - K + 1);
    }
}
