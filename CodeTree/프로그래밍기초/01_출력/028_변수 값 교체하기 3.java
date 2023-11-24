import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 변수 값 교체하기 3
 *  - 링크 : https://www.codetree.ai/missions/4/problems/replacing-variable-values-3/description
 *  2. 풀이핵심
 *  - 교체로직
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}