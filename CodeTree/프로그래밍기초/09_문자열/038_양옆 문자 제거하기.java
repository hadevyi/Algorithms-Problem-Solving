import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 양옆 문자 제거하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/del-both-side-char/description
 * 2. 풀이핵심
 *  - 문자 삭제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int idx = 0;idx < chList.length;idx++) {
            if (idx == 1 || idx == chList.length - 2) continue;
            sb.append(chList[idx]);
        }

        System.out.println(sb.toString());
    }
}