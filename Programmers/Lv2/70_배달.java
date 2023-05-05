import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배달
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12978
 *  2. 풀이핵심
 *  - 최소경로 구하기
 * 3. 풀이후기
 *  - 다익스트라 문제를 오랜만에 공부해서 진행해보았다.
 */
class Solution {

    public int INF = 50000001;
    public int[][] MAP;
    public int[] values;
    public boolean[] isVisited;
    public int solution(int N, int[][] road, int K) {
        MAP = new int[N + 1][N + 1];
        for (int[] map : MAP)
            Arrays.fill(map, INF); // 도로를 건너는 시간의 경계치 직후 수

        // 초기화
        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];
            MAP[a][b] = MAP[b][a] = Math.min(MAP[a][b], c);
        }

        // 자기 자신으로 가는 최소 비용
        for (int i = 0;i <= N;i++)
            MAP[i][i] = 0;

        // 정점 구하기
        isVisited = new boolean[N + 1];
        values = new int[N + 1];
        for (int i = 1; i <= N;i++) {
            values[i] = MAP[1][i];
        }
        isVisited[1] = true;

        for (int i = 1;i < N;i++) {
            int now = getSamllIndex();
            isVisited[now] = true;
            for (int j = 1;j <= N;j++) {
                if (isVisited[j]) continue;
                if (values[now] + MAP[now][j] < values[j])
                    values[j] = values[now] + MAP[now][j];
            }
        }

        int answer = 0;
        for (int i = 1;i <= N;i++)
            if (values[i] <= K)
                answer++;
        return answer;
    }

    public int getSamllIndex() {
        int min = INF;
        int index = 0;
        for (int i = 1;i < values.length;i++) {
            if (!isVisited[i] && values[i] < min) {
                min = values[i];
                index = i;
            }
        }
        return index;
    }
}