import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 실수 받아 그대로 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/enter-real-value-and-print/description
 *  2. 풀이핵심
 *  - 소수점 이하 표기 방법
 * 3. 풀이후기
 *  - 앞서 연습한 부분이라 그런지 많이 어렵지는 않았던 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        System.out.println(Math.round(n * 100) / 100.0);
    }
}