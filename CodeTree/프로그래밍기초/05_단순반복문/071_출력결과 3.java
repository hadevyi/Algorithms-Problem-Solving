import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 3
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201521/description
 * 2. 풀이핵심
 *  - 조건에 따른 반복문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int a = 128, b = 2021; 
while (b != 0) {
    int tmp = a % b; 
    a = b;
    b = tmp;
}
System.out.print(a);
// a = 128, b = 2021    =>  b != 0, 2021 != 0    =>  tmp = 128 % 2021 = 128  =>  a = 2021, b = 128
// a = 2021, b = 128    =>  b != 0, 128 != 0     =>  tmp = 2021 % 128 = 101  =>  a = 128, b = 101
// a = 128, b = 101     =>  b != 0, 101 != 0     =>  tmp = 128 % 101 = 27    =>  a = 101, b = 27
// a = 101, b = 27      =>  b != 0, 27 != 0      =>  tmp = 101 % 27 = 20     =>  a = 27, b = 20
// a = 27, b = 20       =>  b != 0, 26 != 0      =>  tmp = 27 % 20 = 7       =>  a = 20, b = 7
// a = 20, b = 7        =>  b != 0, 7 != 0       =>  tmp = 20 % 7 = 6        =>  a = 7, b = 6
// a = 7, b = 6         =>  b != 0, 6 != 0       =>  tmp = 7 % 6 = 1         =>  a = 6, b = 1
// a = 6, b = 1         =>  b != 0, 1 != 0       =>  tmp = 6 % 1 = 0         =>  a = 1, b = 0
// a = 1, b = 0         =>  b != 0, 0 != 0   
// System.out.println(a) // 1