import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 달에서 무게 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/weight-on-the-moon/submissions
 *  2. 풀이핵심
 *  - 소수점 이하 출력 형식
 * 3. 풀이후기
 *  - printf로 진행한 풀이
 */
public class Main {
    public static void main(String[] args) {
        int wiehgt = 13;
        double toMoon = 0.165000;
        System.out.printf("%d * %.6f = %.6f", wiehgt, toMoon, wiehgt * toMoon);
    }
}