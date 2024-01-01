import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 감소시키며 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/decrease-and-print/description
 * 2. 풀이핵심
 *  - 감소 반복문
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int num = 17;num >= 5;num--)
            sb.append(num).append(" ");
        System.out.println(sb.toString());
    }
}