import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 쇠막대기
 *  - 번호 : 10799
 *  - 링크 : https://www.acmicpc.net/problem/10799
 * 2. 풀이핵심
 *  - 각 조건에 따라 구현하며, 이전 값이 중요함.
 * 3. 풀이후기
 *  - ( 바로 뒤에 )가 나오면 레이저로 절단하며 "( 총 개수 - 1"개 합산
 *  - ) 가 레이저가 아닌 막대의 끝이라면 1개만 합산
 */
public class Main {

    static int COUNT, TOTAL;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charList = br.readLine().toCharArray();
        int Len = charList.length;
        COUNT++;

        for (int len = 1;len < Len;len++) {
            if (charList[len] == '(') COUNT++;
            else {
                if (charList[len - 1] == '(') {
                    TOTAL += (COUNT - 1);
                    COUNT--;
                } else {
                    TOTAL++;
                    COUNT--;
                }
            }
        }

        System.out.println(TOTAL);
    }
}