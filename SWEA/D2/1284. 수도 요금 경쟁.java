import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1284. 수도 요금 경쟁
 *  2. 풀이핵심
 *  - 조건 구현
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, P, Q, R, S, W;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            P = Integer.parseInt(st.nextToken()); // A사의 1리터 당 금액
            Q = Integer.parseInt(st.nextToken()); // B사의 기본요금
            R = Integer.parseInt(st.nextToken()); // 기본요금 최대 기준 용량
            S = Integer.parseInt(st.nextToken()); // 초과량에 대한 1리터 당 금액
            W = Integer.parseInt(st.nextToken()); // 한 달 사용 수도량

            int costA = P * W;
            int costB = calculationB(W, Q, R, S);

            sb.append(costA < costB ? costA : costB);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int calculationB(int waterSupply, int basicCost, int basicMaxSupply, int amountPerLiter) {
        if (waterSupply <= basicMaxSupply) return basicCost;

        int calculationLiter = waterSupply - basicMaxSupply;
        return basicCost + calculationLiter * amountPerLiter;
    }
}
