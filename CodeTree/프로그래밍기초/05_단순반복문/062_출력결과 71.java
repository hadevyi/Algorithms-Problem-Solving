import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 71
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201826/description
 * 2. 풀이핵심
 *  - break 구성하기
 * 3. 풀이후기
 *  - 간단한 문제
 */
int x = 100;
for ( x = 1; x <= 5; x++) {  
    if ( x == 2 ) {    
        continue;  
    }  
    if ( x == 4 ) {    
        break;  
    }  
    System.out.print(x + " ");
}
// x = 1, 출력 1
// x = 2, continue
// x = 3, 출력 3
// x = 4, break;