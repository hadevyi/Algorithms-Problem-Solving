import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 부분문자열 위치 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-location-of-substring/description
 * 2. 풀이핵심
 *  - 문자열 찾기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originStr = br.readLine(), findStr = br.readLine();
        int findIdx = -1;

        for (int i = 0;i < originStr.length() - findStr.length() + 1;i++) {
            if (!originStr.substring(i, i + findStr.length()).equals(findStr)) continue;
            findIdx = i;
            break;
        }

        System.out.println(findIdx);
    }
}