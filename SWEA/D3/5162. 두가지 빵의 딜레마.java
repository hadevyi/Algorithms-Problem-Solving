import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5162. 두가지 빵의 딜레마
 *  2. 풀이핵심
 *  - 각 구성에 대한 최대를 확인하기
 * 3. 풀이후기
 *  - 다이나믹 프로그래밍을 풀어도 풀어도 헷갈린다 어려운거같다...
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));  // 30
    }

    public static int solution(int[][] triangle) {
        int N = triangle.length;

        for (int n = 1;n < N;n++) {
            for (int m = 0;m <= n;m++) {
                if (m == 0) triangle[n][m] += triangle[n - 1][m];
                else if (m == triangle[n].length - 1) triangle[n][m] += triangle[n - 1][m - 1];
                else triangle[n][m] += Math.max(triangle[n - 1][m - 1], triangle[n - 1][m]);
            }
        }

        int answer = 0;
        for (int data : triangle[N - 1])
            answer = Math.max(answer, data);

        return answer;
    }
}