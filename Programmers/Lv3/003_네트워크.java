import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 네트워크
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/43162
 *  2. 풀이핵심
 *  - 너비우선 탐색에 대한 기록
 * 3. 풀이후기
 *  - 처음에 union-find를 사용했지만, parent의 연결이 항상 보장될수가 없는 문제 유형이기 때문에 제대로 확인이 어려웠다.
 *  - 따라서, 컴퓨터의 개수가 200이하이기에 bfs로 직접 탐색해, 연결되어있다면 memo를 하는 방식으로 진행하였다.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); // 2
        System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}})); // 1
        System.out.println(solution(5, new int[][] {{1, 0, 0, 0, 1}, {0, 1, 1, 0, 0}, {0, 1, 1, 1, 0}, {0, 0, 1, 1, 1}, {1, 0, 0, 1, 1}})); // 1
    }

    public static int[] parent;
    public static boolean[] isVisited;
    public static int solution(int n, int[][] computers) {
        parent = new int[n];
        isVisited = new boolean[n];

        int memoNum = 0;
        for (int i = 0;i < n;i++){
            if (isVisited[i]) continue;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            isVisited[i] = true;
            parent[i] = memoNum;

            while (!queue.isEmpty()) {
                int index = queue.poll();

                for (int idx = 0;idx < n;idx++) {
                    if (computers[index][idx] == 0) continue;
                    if (isVisited[idx]) continue;
                    if (index == idx) continue;

                    queue.offer(idx);
                    isVisited[idx]= true;
                    parent[idx] = memoNum;
                }
            }

            memoNum++;
        }

        Set<Integer> set = new HashSet<>();
        for (int p : parent)
            set.add(p);
        return set.size();
    }
}