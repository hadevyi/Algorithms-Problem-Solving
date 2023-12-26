import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 10
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201530/description
 * 2. 풀이핵심
 *  - 출력 예측
 * 3. 풀이후기
 *  - 문제 진행 단계 확인
 */
int n = 128, i, result = 0; 
for (i = 1; i < n; i++) {
    if (n % i == 0) { 
        result += i;
    } 
}
/**
 * 128의 약수 중 128은 미포함한 모든 약수의 합
 * 1 128
 * 2 64
 * 4 32
 * 8 16
 * 1 + 2 + 4 + 8 + 16 + 32 + 64 
 * = 3 + 4 + 8 + 16 + 32 + 64 
 * = 7 + 8 + 16 + 32 + 64
 * = 15 + 16 + 32 + 64
 * = 31 + 32 + 64
 * = 63 + 64
 * = 127
 * 
 * answer : 127
 */