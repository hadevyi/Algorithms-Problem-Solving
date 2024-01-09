import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : a/b 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/a-divide-b/description
 * 2. 풀이핵심
 *  - 소수점 이하 계산
 * 3. 풀이후기
 *  - BigDecimal을 통해서 상세한 소수점 이하를 표현할 수 있도록 했다. 오랜만에 막혔던 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigDecimal a = new BigDecimal(st.nextToken());
        BigDecimal b = new BigDecimal(st.nextToken());
        System.out.println(a.divide(b, 20, RoundingMode.DOWN));
    }
}