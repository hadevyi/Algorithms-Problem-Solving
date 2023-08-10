import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 신
 *  - 번호 : 1422
 *  - 링크 : https://www.acmicpc.net/problem/1422
 *  2. 풀이핵심
 *  - 문자열의 비교
 * 3. 풀이후기
 *  - 프로그래머스 "가장 큰 수"와 유사한 문제임
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<String> pq = new PriorityQueue<>((o1, o2) -> {
            return (o2 + o1).compareTo(o1 + o2);
        });
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        for (int k = 0;k < K;k++)
            arr[k] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for (int a : arr)
            pq.add(Integer.toString(a));
        if (K < N)
            for (int i = 0;i < N - K;i++)
            pq.add(Integer.toString(arr[K - 1]));

        StringBuffer sb = new StringBuffer();
        while (!pq.isEmpty())
            sb.append(pq.poll());
        System.out.println(sb.toString());
    }
}
