import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 *  2. 풀이핵심
 *  - MAP 활용하기
 * 3. 풀이후기
 *  - 간단한 반복조건문
 */
public class Solution {

    public static int T;
    public static Map<Integer, Integer> MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            int testCase = Integer.parseInt(br.readLine());
            MAP = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            int SIZE = st.countTokens();

            for (int size = 0;size < SIZE;size++) {
                int score = Integer.parseInt(st.nextToken());

                if (MAP.containsKey(score)) MAP.put(score, MAP.get(score) + 1);
                else MAP.put(score, 1);
            }

            int NUM = 0, TIME = 0;

            for (int key : MAP.keySet()) {
                if (TIME < MAP.get(key)) {
                    NUM = key;
                    TIME = MAP.get(key);
                } else if (TIME == MAP.get(key) && NUM < key)
                    NUM = key;
            }

            sb.append("#").append(testCase).append(" ").append(NUM);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}