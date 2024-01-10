import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출력결과 48
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reading-k201724/description
 * 2. 풀이핵심
 *  - 조건 반복 결과 예측하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
int i, sum = 0;
for(i = 1; i <= 10; i += 2){
    if(i % 3 == 0) {
        sum += i - 1;
    }
}
System.out.println(sum);
// i = 1 ~ 10까지 2씩 증가
// = 1 3 5 7 9
// 이 중에서 3의 배수인 경우 i - 1 해서 모두 합하기
// 3 9 = 2 + 8 = 10