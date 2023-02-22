/**
 * 1. 문제정보
 *  - 제목 : 점의 위치 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120841
 *  2. 풀이핵심
 *  - 어떤 사분면에 속해있는지 반환하기
 * 3. 풀이후기
 *  - x, y가 0일 수 없음을 명시했으므로 간단하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {2, 4})); // 1
        System.out.println(solution(new int[] {-7, 9})); // 2
    }

    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) return 1;
        else if (dot[0] < 0 && dot[1] > 0) return 2;
        else if (dot[0] < 0 && dot[1] < 0) return 3;
        else return 4;
    }
}