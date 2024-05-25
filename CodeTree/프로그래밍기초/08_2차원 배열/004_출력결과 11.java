import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 11
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201531/description
 * 2. 풀이핵심
 *  - 2차원 배열 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int[][] arr = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
int i, j;
for (i = 0; i < 3; i++) {
    for(j = 0; j < 3; j++) {
        System.out.print("ANSWER" + " ");
    }
    System.out.println();
}
// 출력결과
// 7 4 1
// 8 5 2
// 9 6 3
// arr[2][0] arr[1][0] arr[0][0]
// arr[2][1] arr[1][1] arr[0][1]
// arr[2][2] arr[1][2] arr[0][2]
// = arr[2 - j][i]