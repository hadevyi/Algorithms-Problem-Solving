import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 증가시키며 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/increase-and-print/description
 * 2. 풀이핵심
 *  - 반복문과 StringBuffer 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i = 5;i <= 17;i += 2)
            sb.append(i).append(" ");
        System.out.println(sb.toString());
    }
}