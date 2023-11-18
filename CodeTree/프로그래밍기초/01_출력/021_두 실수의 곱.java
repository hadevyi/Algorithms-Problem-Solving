import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 실수의 곱
 *  - 링크 : https://www.codetree.ai/missions/4/problems/the-product-of-two-real-numbers/description
 *  2. 풀이핵심
 *  - 0 출력시키기
 * 3. 풀이후기
 *  - 가장 뒤에 0이 있으면, 나오지 않기에 이를 출력하는 방법을 확인했다.
 */
public class Main {
    public static void main(String[] args) {
        double a = 5.26, b = 8.27;
        System.out.printf("%.3f", (a*b));
    }
}