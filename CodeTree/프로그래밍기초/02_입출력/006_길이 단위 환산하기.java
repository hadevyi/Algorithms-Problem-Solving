import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 길이 단위 환산하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/convert-length-units/description
 *  2. 풀이핵심
 *  - 연산 및 소수점 이하 표기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ft = Double.parseDouble(br.readLine()) * 30.48;
        System.out.println(Math.round(ft * 10) / 10.0);
    }
}