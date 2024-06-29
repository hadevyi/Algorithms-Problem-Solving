import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 47
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201723/description
 * 2. 풀이핵심
 *  - 문자열 순회하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
char[] s = "congratulation".toCharArray(); 
int i;
for (i = 0; i < 14; i++){
    if (s[i] == 'a') continue; 
    if (s[i] == 'e') continue; 
    if (s[i] == 'i') continue; 
    if (s[i] == 'o') continue; 
    if (s[i] == 'u') continue; 
    System.out.print(s[i]); // aeiou가 무시된 출력물
}
System.out.println();   // cngrtltn