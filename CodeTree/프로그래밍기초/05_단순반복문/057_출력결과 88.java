import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 88
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-88/description
 * 2. 풀이핵심
 *  - continue 연습하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int x;
for(x=-1; x<=20; x++) {  
    if(x < 10)    
        continue;
    System.out.println("Leebros");
}
// x = -1
// x = 0
// ...
// 모두 x < 10에 충족해서 continue 됨.
// x = 10부터 실행가능하며 총 x = 20까지 나올 수 있음
// 즉, 11번