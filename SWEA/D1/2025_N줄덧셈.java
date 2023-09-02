import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 2025. N줄덧셈
 *  2. 풀이핵심
 *  - 중첩합
 * 3. 풀이후기
 *  - 반복문 연습
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MAX_NUM = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int ANS = 0;
        for (int num = 1;num <= MAX_NUM;num++)
            ANS += num;
        sb.append(ANS);
        System.out.println(sb.toString());
    }
}
