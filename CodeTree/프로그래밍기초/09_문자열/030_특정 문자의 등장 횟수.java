import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 문자의 등장 횟수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-appearances-of-a-particular-character/description
 * 2. 풀이핵심
 *  - 문자열 찾기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chList = br.readLine().toCharArray();

        int eeCount = 0, ebCount = 0;
        for (int i = 0;i < chList.length - 1;i++) {
            if (chList[i] != 'e') continue;
            if (chList[i + 1] == 'e') eeCount++;
            else if (chList[i + 1] == 'b') ebCount++;
        }

        System.out.printf("%d %d", eeCount, ebCount);
    }
}