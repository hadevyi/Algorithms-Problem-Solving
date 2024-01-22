import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 37
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201647/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
Scanner sc = new Scanner(System.in);
int m = 0;
int n = sc.nextInt();
while (n != 1) {
    if(n % 2 == 0) n /= 2;  // 짝수일 때, x 1/2
    else n = 3 * n + 1;     // 홀수일 때, x 3 + 1
    m++;
}
System.out.println(m);
// n = 5, 32