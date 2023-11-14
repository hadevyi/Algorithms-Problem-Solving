import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 세 정수형 변수 선언
 *  - 링크 : https://www.codetree.ai/missions/4/problems/declaration-of-three-natural-numbers/description
 *  2. 풀이핵심
 *  - 간단한 선언과 연산
 * 3. 풀이후기
 *  - 쉬운 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int a = 7, b = 23, c = 30;
        sb.append(a).append(" + ").append(b).append(" = ").append(c);
        System.out.println(sb.toString());
    }
}