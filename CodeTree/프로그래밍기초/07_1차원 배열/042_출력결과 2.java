/**
 * 1. 문제정보
 *  - 제목 : 출력결과 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201520/description
 *  2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int i, max;
int[] a = new int[]{1, 8, 9, 10, 10, 2, 6}; 
max = a[0];
for (i = 0; i < 7; i++) {
    if (a[i] > max) max = a[i]; 
}
System.out.print(max);
// 10