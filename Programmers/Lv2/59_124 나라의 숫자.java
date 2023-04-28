/**
 * 1. 문제정보
 *  - 제목 : 124 나라의 숫자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12899#
 *  2. 풀이핵심
 *  - 반복해서 진행하는 표현식
 * 3. 풀이후기
 *  - 재귀를 통해 해결했는데, memo를 사용하면 더 빨라질 것 같다.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 1;i <= 50000000;i++)
            System.out.println(i + "\t" + solution(i));
    }

    public static StringBuffer sb;
    public static String solution(int n) {
        sb = new StringBuffer();
        get124(n);
        return sb.toString();
    }

    public static int[] STEP = {4, 1, 2};
    public static void get124(int num) {
        int div = (num - 1) / 3;
        int mod = num % 3;

        if (div == 0) sb.append(STEP[mod]);
        else {
            get124(div);
            sb.append(STEP[mod]);
        }
    }
}
