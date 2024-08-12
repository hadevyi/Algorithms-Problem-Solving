import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 각 자리 숫자들의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-each-digit/description
 * 2. 풀이핵심
 *  - 정수를 문자열로 변환하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(sumEach(br.readLine()));
    }

    private static Integer sumEach(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) sum += (int) (ch - '0');
        return sum;
    }
}