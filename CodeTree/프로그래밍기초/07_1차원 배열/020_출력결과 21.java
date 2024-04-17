import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 21
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201545/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] A = new int[]{0, 3, 0, 2, 3, 0};
        int[] B = new int[]{1, 2, 1};
        int i, j;
        for(i = 1; i < 5; i++) {            // i = 1
            int c = 0;                      // c = 0
            for(j = 0; j < 3; j++) {        // j = 0, 1, 2
                c += A[i + j - 1] * B[j];   // c += A[1 + 0 - 1] * B[0] = A[0] * B[0] = 0
                                            // c += A[1 + 1 - 1] * B[1] = A[1] * B[1] = 3 * 2 = 6
                                            // c += A[1 + 2 - 1] * B[2] = A[2] * B[2] = 0 * 1 = 0

                                            // i = 2
                                            // c = 0
                                            // j = 0
                                            // c += A[2 + 0 - 1] * B[0] = A[1] * B[0] = 3
                                            // c += A[2 + 1 - 1] * B[1] = A[2] * B[0] = 0
                                            // c += A[2 + 2 - 1] * B[2] = A[3] * B[0] = 2
            }
            System.out.print(c);            // 65(78)
        }
        System.out.println();
    }
}