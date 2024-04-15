import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 12
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201532/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] A = new int[]{5, -2, 0, 3, 5};
        int i;
        for (i = 1; i < 4; i++) {
            System.out.print((A[i] * 2 + A[i - 1] + A[i + 1]) / 4 + " ");
            // i = 1, (A[1] * 2 + A[0] + A[2]) / 4 = (-4 + 5 + 0) / 4 = 1 / 4 = 0
            // i = 2, (A[2] * 2 + A[1] + A[3]) / 4 = (0 + -2 + 3) / 4 = 1 / 4 = 0
            // i = 3, (A[3] * 2 + A[2] + A[4]) / 4 = (6 + 0 + 5) / 4 = 11 / 4 = 2
        }
        System.out.println(); // 0 0 2
    }
}