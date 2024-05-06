import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2가 3번째로 등장하는 위치
 *  - 링크 : https://www.codetree.ai/missions/4/problems/where-2-appears-3rd/description
 * 2. 풀이핵심
 *  - 탐색
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ARR = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        int count = 0, result = 0;
        for (int n = 0;n < N;n++) {
            if (ARR[n] != 2) continue;
            count++;
            if (count == 3) {
                result = n;
                break;
            }
        }

        System.out.println(result + 1);
    }
}