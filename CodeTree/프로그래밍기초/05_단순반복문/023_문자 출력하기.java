import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-text/description
 * 2. 풀이핵심
 *  - 반복 출력
 * 3. 풀이후기
 *  - 간단만 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String text = br.readLine();
        for (int i = 0;i < 8;i++)
            sb.append(text);
        System.out.println(sb.toString());
    }
}