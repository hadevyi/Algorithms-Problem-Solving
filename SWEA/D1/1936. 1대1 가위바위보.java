import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1936. 1대1 가위바위보
 *  2. 풀이핵심
 *  - 조건문 확인
 * 3. 풀이후기
 *  - 간단한 진행으로 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if ((A == 3 && B == 2) || (A == 2 && B == 1) || (A == 1 && B == 3))
            System.out.println("A");
        else
            System.out.println("B");
    }
}
