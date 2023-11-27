import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 변수 값 복사하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/copying-variable-values/description
 *  2. 풀이핵심
 *  - 데이터 값 복사
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        a = b = c;
        System.out.println(a + " " + b + " " + c);
    }
}