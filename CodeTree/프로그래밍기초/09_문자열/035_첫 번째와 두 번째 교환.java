import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 첫 번째와 두 번째 교환
 *  - 링크 : https://www.codetree.ai/missions/4/problems/exchange-1st-and-2nd/description
 * 2. 풀이핵심
 *  - 문자 수정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();
        char change1 = chList[0], change2 = chList[1];
        
        for (int idx = 0;idx < chList.length;idx++) {
            if (chList[idx] != change1 && chList[idx] != change2) continue;
            chList[idx] = chList[idx] == change1 ? change2 : change1;
        }

        StringBuffer sb = new StringBuffer();
        for (char ch : chList) sb.append(ch);
        System.out.println(sb.toString());
    }
}