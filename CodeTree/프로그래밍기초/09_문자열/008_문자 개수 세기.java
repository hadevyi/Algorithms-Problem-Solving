import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자 개수 세기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/count-char/description
 * 2. 풀이핵심
 *  - 공백있는 문자열 한번에 입력받기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chList = br.readLine().toCharArray();
        char ch = br.readLine().charAt(0);
        int Len = chList.length, count = 0;

        for (int idx = 0;idx < Len;idx++) {
            if (chList[idx] != ch) continue;
            count++;
        }

        System.out.println(count);
    }
}