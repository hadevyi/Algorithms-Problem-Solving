/**
 * 1. 문제정보
 *  - 제목 : 피로도
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/87946
 *  2. 풀이핵심
 *  - 범위 수가 작은 내용으로 간단한 순열 구현으로 진행함 
 * 3. 풀이후기
 *  - visited를 꼼꼼히 하면서 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(80, new int[][] {{80,20}, {50,40}, {30,10}})); // 3
    }

    public static int MAX;
    public static int[] arr;
    public static boolean[] isVisited;
    public static int solution(int k, int[][] dungeons) {
        // 0 최소 필요도, 1 소모필요도
        MAX = 0;
        arr = new int[dungeons.length];
        isVisited = new boolean[dungeons.length];
        prime(0, k, dungeons);
        return MAX;
    }

    public static void prime(int count, int k, int[][] dungeons) {
        if (count == dungeons.length) {
            MAX = Math.max(checkDungeon(k, dungeons), MAX);
            return;
        }

        for (int i = 0;i < dungeons.length;i++) {
            if (isVisited[i]) continue;
            isVisited[i] = true;
            arr[count] = i;
            prime(count + 1, k, dungeons);
            isVisited[i] = false;
        }
    }

    public static int checkDungeon(int k, int[][] dungeons) {
        int count = 0;
        for (int idx : arr) {
//            System.out.print(idx + " : ");
            int[] nowDungeons = dungeons[idx];

            if (nowDungeons[0] <= k) {
//                System.out.print("( O ; " + count + " - " + Arrays.toString(nowDungeons) + ") => \t");
                count++;
                k -= nowDungeons[1];
            } else {
//                System.out.println("( X ; " + count + " - " + Arrays.toString(nowDungeons) + ") => \t");
                return count;
            }
        }
        System.out.println(count);
        return count;
    }
}
