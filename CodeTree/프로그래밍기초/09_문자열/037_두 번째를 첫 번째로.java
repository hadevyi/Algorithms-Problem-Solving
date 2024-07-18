import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 번째를 첫 번째로
 *  - 링크 : https://www.codetree.ai/missions/4/problems/second-to-first/description
 * 2. 풀이핵심
 *  - 문자 수정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();
        char base = chList[1], renew = chList[0];

        for (int idx = 1;idx < chList.length;idx++) {
            if (chList[idx] != base) continue;
            chList[idx] = renew;
        }

        StringBuffer sb = new StringBuffer();
        for (char ch : chList) sb.append(ch);
        System.out.println(sb.toString());
    }
}