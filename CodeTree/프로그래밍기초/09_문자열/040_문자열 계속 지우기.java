import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 계속 지우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/keep-removing-string/description
 * 2. 풀이핵심
 *  - 문자 삭제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originStr = br.readLine(), findStr = br.readLine();

        while (originStr.contains(findStr)) {
            int frontEndIdx = originStr.indexOf(findStr), backStartIdx = frontEndIdx + findStr.length();
            String front = originStr.substring(0, frontEndIdx), back = "";
            if (0 <= backStartIdx && backStartIdx <= originStr.length()) back = originStr.substring(backStartIdx);
            originStr = front + back;
        }

        System.out.println(originStr);
    }
}