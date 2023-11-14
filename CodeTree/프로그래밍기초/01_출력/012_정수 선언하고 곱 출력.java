import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수 선언하고 곱 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/Declare-an-integer-and-print-the-multiplication/description
 *  2. 풀이핵심
 *  - 간단한 선언 및 출력
 * 3. 풀이후기
 *  - 쉬운 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int a = 26;
        int b = 5;
        sb.append(26).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(sb.toString());
    }
}