import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정수 선언하고 뺄셈
 *  - 링크 : https://www.codetree.ai/missions/4/problems/define-numbers-and-substract/introduction
 *  2. 풀이핵심
 *  - 간단한 선언, 연산
 * 3. 풀이후기
 *  - 빠른 출력을 위해 StringBuffer를 사용함
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int num1 = 97;
        int num2 = 13;
        sb.append(num1).append(" - ").append(num2).append(" = ").append(num1-num2);
        System.out.println(sb.toString());
    }
}