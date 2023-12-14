/**
 * 1. 문제정보
 *  - 제목 : 2016년
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12901
 *  2. 풀이핵심
 *  - 윤년이니 2월이 하루가 더 큼
 * 3. 풀이후기
 *  - 나머지로 출력하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(1, 1)); // FRI
        System.out.println(solution(5, 24)); // TUE
    }

    public static int[] Month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 0 dummy
    public static String[] Day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public static String solution(int a, int b) {
        int days = 0;
        for (int i = 1;i < a;i++)
            days += Month[i];
        days += b;
        return Day[days % 7];
    }
}
