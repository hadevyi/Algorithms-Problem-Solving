/**
 * 1. 문제정보
 *  - 제목 : 주사위의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120845
 *  2. 풀이핵심
 *  - 가능한 최대 개수이기에, 몫의 곱하기 방식으로 진행함
 * 3. 풀이후기
 *  - 길이와 내용이 정해져있어 한 줄짜리 코드가 가능했음 
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 1, 1}, 1)); // 1
        System.out.println(solution(new int[] {10, 8, 6}, 3)); // 12
    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
