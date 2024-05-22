import java.util.*;
import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 최대 GCD
 *  - 번호 : 9417
 *  - 링크 : https://www.acmicpc.net/problem/9417
 * 2. 풀이핵심
 *  - 모든 수의 다양한 경우의 수 중 최대 값 찾기
 *  - 최대공약수 찾는 방법
 * 3. 풀이후기
 *  - 모든 경우의 수는 이중 for를 활용해 진행하였음 > 추후 순서쌍 발급을 할 수 있는 조합으로 해보기
 *  - 유클리드 호제법을 활용해 최대공약수을 찾았음
 */
public class Main {
    static int[] arr;
    static int Len, MAX;

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            Len = st.countTokens();
            arr = new int[Len];
            MAX = 0;

            for (int len = 0;len < Len;len++)
                arr[len] = Integer.parseInt(st.nextToken());

            findMAXGCD();
            sb.append(MAX);
            if (n < N - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int GCD(int n1, int n2) {
        return n2 == 0 ? n1 : GCD(n2, n1%n2);
    }

    public static void findMAXGCD() {
        for (int i = 0;i < Len;i++)
            for (int j = i + 1;j < Len;j++)
                MAX = Math.max(MAX, GCD(arr[i], arr[j]));
    }
}