import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 8
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201528/description
 * 2. 풀이핵심
 *  - 출력 예측
 * 3. 풀이후기
 *  - 문제 진행 단계 확인
 */
int a = 60, b = 0, i; 
for (i = 1; i <= a; i++) {
    if (a % i == 0) b++;
}
System.out.println(b);
/**
 * 60의 약수의 개수
 * 1 60
 * 2 30
 * 3 20
 * 4 15
 * 5 12
 * 6 10
 */