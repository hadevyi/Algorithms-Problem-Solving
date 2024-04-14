import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 7
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201527/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{-12, 25, -36, 23, -1};
        int s = 0, i;                   // s = 0 > -12 > 37 > -14
        for(i = 0; i < 4; i++) {        // i = 0, 1, 2, 3
            if (i % 2 == 0) s += a[i];  // i = 0, s = s + a[0] = 0 + -12 = -12
                                        // i = 2, s = s + a[2] = 37 + -36 = 1
            else s = a[i] - s;          // i = 1, s = a[1] - s = 25 - -12 = 37
                                        // i = 3, s = a[3] - s = 23 - 1 = 22
        }                               
        System.out.println(s * a[i]);   // 총합 * a[4] = 22 * -1 = -22
    }
}