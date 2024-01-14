import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 41
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201714/description
 * 2. 풀이핵심
 *  - 범위의 중첩 곱 구하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int i, c = 1;
for(i = -3; i <= 3; i++)
    c *= i;
System.out.println(c);
// i = -3   -3
// i = -2   6
// i = -1   -6
// i = 0    여기서 0으로 초기화
// i = 1    0
// i = 2    0
// i = 3    0