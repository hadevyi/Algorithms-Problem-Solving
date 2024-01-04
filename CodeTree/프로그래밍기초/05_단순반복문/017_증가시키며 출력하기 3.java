import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 증가시키며 출력하기 3
 *  - 링크 : https://www.codetree.ai/missions/4/problems/increase-and-print-3/description
 * 2. 풀이핵심
 *  - 증가 반복문
 * 3. 풀이후기
 *  - 간단만 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        for(int num = 10;num <= 26;num += 2)
            sb.append(num).append(" ");
        System.out.println(sb.toString());
    }
}