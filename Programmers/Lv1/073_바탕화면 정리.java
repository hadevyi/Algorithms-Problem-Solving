import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 바탕화면 정리
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/161990
 *  2. 풀이핵심
 *  - 파일이 있는 위치의 최소/최대값을 구별하면 됨
 * 3. 풀이후기
 *  - 생각보다 더 간단해서 당황한 문제, 최대한 짧게 구현하는 것을 생각하면 쉬웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {".#...", "..#..", "...#."}))); // [0, 1, 3, 4]
        System.out.println(Arrays.toString(solution(new String[] {"..........", ".....#....", "......##..", "...##.....", "....#....."}))); // [1, 3, 5, 8]
        System.out.println(Arrays.toString(solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."}))); // [0, 0, 7, 9]
        System.out.println(Arrays.toString(solution(new String[] {"..", "#."}))); // [1, 0, 2, 1]
    }

    public static int N, M;
    public static int[] solution(String[] wallpaper) {
        N = wallpaper[0].length();
        M = wallpaper.length;

        int[] result = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int m = 0;m < M;m++)
            for (int n = 0;n < N;n++) {
                char ch = wallpaper[m].charAt(n);
                if (ch == '#') {
                    result[0] = Integer.min(result[0], m);
                    result[1] = Integer.min(result[1], n);
                    result[2] = Integer.max(result[2], m + 1);
                    result[3] = Integer.max(result[3], n + 1);
                }
            }

        return result;
    }
}
