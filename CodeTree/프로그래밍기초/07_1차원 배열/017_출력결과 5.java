import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 5
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201524/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{0, 9, 8, 4, 0, 0, 1, 2, 0, 1}; 
        int cnt = 0, i;
        for (i = 0; i < 9; i++) {           // 앞에서 순서대로 진행
            arr[i + 1] += arr[i];           // 기준 직후의 값에 직전 값을 누적시켜준다.
        }                                   // {0, 9, 17, 21, 21, 21, 22, 24, 24, 25}
        System.out.print(arr[7] - arr[2]);  // 24 - 17 = 7
    }
}