import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : a로 채워넣기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/filling-with-a/description
 * 2. 풀이핵심
 *  - 문자 수정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chList = br.readLine().toCharArray();
        chList[1] = chList[chList.length - 2] = 'a';

        StringBuffer sb = new StringBuffer();
        for (char ch : chList)
            sb.append(ch);

        System.out.println(sb.toString());
    }
}