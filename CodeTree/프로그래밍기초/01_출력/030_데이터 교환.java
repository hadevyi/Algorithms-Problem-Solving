import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 데이터 교환
 *  - 링크 : https://www.codetree.ai/missions/4/problems/exchange-data/description
 *  2. 풀이핵심
 *  - 교환로직
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}