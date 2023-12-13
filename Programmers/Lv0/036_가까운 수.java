/**
 * 1. 문제정보
 *  - 제목 : 가까운 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120890
 *  2. 풀이핵심
 *  -  가장 차이가 작은 내용을 기준으로 확인하며 갱신함
 * 3. 풀이후기
 *  - 차이를 기준으로 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {3, 10, 28}, 20)); // 28
        System.out.println(solution(new int[] {10, 11, 12}, 13)); // 12
    }

    public static int solution(int[] array, int n) {
        int gapMiN = Integer.MAX_VALUE, minNum = Integer.MAX_VALUE;

        for (int data : array) {
            if (gapMiN > Math.abs(data - n)) {
                gapMiN = Math.abs(data - n);
                minNum = data;
            } else if (gapMiN == Math.abs(data - n)) {
                if (minNum > data)
                    minNum = data;
            }
        }

        return minNum;
    }
}
