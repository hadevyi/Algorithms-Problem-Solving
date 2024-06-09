import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 두번 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-string-twice/description
 * 2. 풀이핵심
 *  - 공백없는 문자열 입력받아 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuffer sb = new StringBuffer();
        sb.append(str).append("\n").append(str);
        System.out.println(sb.toString());
    }
}