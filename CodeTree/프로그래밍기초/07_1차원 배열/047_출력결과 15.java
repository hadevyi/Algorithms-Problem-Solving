import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 15
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201536/description
 * 2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int[] A = new int[]{11, 8, 13, 7}; 
int[] B = new int[]{2, 6, 4, 10};
int i, j, ans = 0;
for (i = 0; i < 4; i++) {
    for (j = 0; j < 4; j++) {
        if(A[i] + B[j] <= 16 && A[i] + B[j] > ans) { // ans < A[i] + B[j] <= 16
            ans = A[i] + B[j];
            // i = 0, j = 0, A[i] + B[j] = A[0] + B[0] = 11 + 2 = 13    ans = 13
            // i = 0, j = 1, A[i] + B[j] = A[0] + B[1] = 11 + 6 = 17 (X)
            // i = 0, j = 2, A[i] + B[j] = A[0] + B[2] = 11 + 4 = 15    ans = 15
            // i = 0, j = 3, A[i] + B[j] = A[0] + B[3] = 11 + 10 = 21 (X)
            // i = 1, j = 0, .. X
        }	
    }
}
System.out.println(ans); // 15
