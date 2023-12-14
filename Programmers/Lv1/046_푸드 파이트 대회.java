/**
 * 1. 문제정보
 *  - 제목 : 푸드 파이트 대회
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134240
 *  2. 풀이핵심
 *  - 짝수가 되는 내용을 잘 확인해 원하는 위치로 배치함
 * 3. 풀이후기
 *  - 몫으로 반복하며 진행함. 0은 항상 1임이 보장되어있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 3, 4, 6})); // 1223330333221
        System.out.println(solution(new int[] {1, 7, 1, 2})); // 111303111
    }

    public static String solution(int[] food) {
        StringBuffer sb = new StringBuffer();

        for (int i = 1;i < food.length;i++)
            for (int j = 0;j < food[i] / 2;j++)
                sb.append(i);

        sb.append("0");

        for (int i = food.length - 1;i > 0;i--)
            for (int j = 0;j < food[i] / 2;j++)
                sb.append(i);

        return sb.toString();
    }
}
