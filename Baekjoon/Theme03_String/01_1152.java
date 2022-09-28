import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어의 개수 
 *  - 번호 : 1152
 *  - 링크 : https://www.acmicpc.net/problem/1152
 *  2. 풀이핵심
 *  - 공백을 기준으로 단어 개수 세기
 * 3. 풀이후기
 *  - StringTokenizer 혹은 Split으로 해결할 수 있음
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }
}