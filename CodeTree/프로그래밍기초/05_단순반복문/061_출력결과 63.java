import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 63
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201816/description
 * 2. 풀이핵심
 *  - break 구성하기
 * 3. 풀이후기
 *  - 간단한 문제
 */
int x;
for(x=-1; x<=20; x++) {  
    if(x < 10)    
        continue;  
    else if(x >= 10)
        break;  
    System.out.println("Leebros");
}
// x = -1 ~ 9 까지는 모두 continue가 될 것이다.
// x = 10이 되는 순간 break가 된다.
// 즉, 출력 값이 없다.