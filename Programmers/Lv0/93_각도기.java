/**
 * 1. 문제정보
 *  - 제목 : 각도기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120829
 *  2. 풀이핵심
 *  - 조건문을 구현하기
 * 3. 풀이후기
 *  - if elseif else의 블럭 세트의 특징을 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(70)); // 1
        System.out.println(solution(91)); // 3
        System.out.println(solution(180)); // 4
    }

    public static int solution(int angle) {
        if (angle == 180) return 4;
        else if (angle > 90) return 3;
        else if (angle == 90) return 2;
        else return 1;
    }
}
