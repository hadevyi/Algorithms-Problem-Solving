import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 78
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201833/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int a = 2;
int b = 2;
while(b > 0)
{  
    a++;    
    b--;     
}
// a = 2, b = 2     =>      b > 0   => a = 3, b = 1
// a = 3, b = 1     =>      b > 0   => a = 4, b = 0
do{    
    a--;    
    b++;
} while(a > 0);
System.out.println(b);
// a = 4, b = 0     =>      a = 3, b = 1        =>      a > 0
// a = 3, b = 1     =>      a = 2, b = 2        =>      a > 0
// a = 2, b = 2     =>      a = 1, b = 3        =>      a > 0
// a = 1, b = 3     =>      a = 0, b = 4        =>      a > 0 
// System.out.println(b)    // 4