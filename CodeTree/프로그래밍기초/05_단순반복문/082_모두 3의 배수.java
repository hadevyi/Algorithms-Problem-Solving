import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 모두 3의 배수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/all-multiples-of-3/description
 * 2. 풀이핵심
 *  - 조건 충족 확인
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int SIZE = 5, NUM = 3;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isAll = true;

        for (int size = 0;size < SIZE;size++) {
            if (Integer.parseInt(br.readLine()) % NUM != 0) {
                isAll = false;
                break;
            }
        }

        System.out.println(isAll ? 1 : 0);
    }
}