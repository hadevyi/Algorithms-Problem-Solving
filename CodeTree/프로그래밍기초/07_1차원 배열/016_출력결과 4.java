import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 4
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201523/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{0, 1, 1, 1, 0, 0, 1, 1, 1, 1}; 
        int cnt = 0, i = 0;
        for (i = 1; i < 10; i++) {      // i = 1
            if (arr[i] == arr[i - 1])   // 직전과 직후의 값이 같다면,
                cnt = cnt + 1;          // 하나 증가
            else{                       // 다르다면,
                cnt = cnt - 1;          // 하나 감소
            }
        }
        System.out.print(cnt);          // 3
    }
}