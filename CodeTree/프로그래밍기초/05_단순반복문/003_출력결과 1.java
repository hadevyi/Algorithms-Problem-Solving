import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 1
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201517/description
 * 2. 풀이핵심
 *  - 출력 예측
 * 3. 풀이후기
 *  - 문제 진행 단계 확인
 */
int q = 0, s = 1, t = 1, i;
for (i = 0; i < 4; i++) {
    q = s + t;
    t = s;
    s = q;
}
System.out.print(q);
/**
 * i = 0, q = 0, s = 1, t = 1
 * q = s + t = 1 + 1 = 2
 * t = s = 1
 * s = q = 2
 * 
 * i = 1, q = 2, t = 1, s = 2
 * q = s + t = 2 + 1 = 3
 * t = s = 2
 * s = q = 3
 * 
 * i = 2, q = 3, t = 2, s = 3
 * q = s + t = 3 + 2 = 5
 * t = s = 3
 * s = q = 5
 * 
 * i = 3, q = 5, t = 3, s = 5
 * q = s + t = 5 + 3 = 8
 * t = s = 5
 * s = 1 = 8
 * 
 * answer ; 8
 */