import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 77
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201832/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int tmp = 0, i = 1;
while(i < 10) 
{  
    if(i % 2 == 0)     // 짝수
        i++;         
    if(tmp > 5)        // 5 초과
        break;   
    tmp += i; 
}
System.out.println(tmp);
// tmp = 0, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 1, i = 1
// tmp = 1, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 2, i = 1
// tmp = 2, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 3, i = 1
// tmp = 3, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 4, i = 1
// tmp = 4, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 5, i = 1
// tmp = 5, i = 1   => i가 짝수가 아님, tmp가 5초과가 아님  => tmp += 1     => tmp = 6, i = 1
// tmp = 6, i = 1   => i가 짝수가 아님, tmp가 5초과임 break;
// System.out.println(tmp) // 6