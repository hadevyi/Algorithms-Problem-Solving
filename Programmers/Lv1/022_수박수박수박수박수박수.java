/**
 * 1. 문제정보
 *  - 제목 : 수박수박수박수박수박수?
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12922
 *  2. 풀이핵심
 *  - 해당 수만큼 반복하면서 출력하기
 * 3. 풀이후기
 *  - 반복문과 나머지를 활용해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3)); // 수박수
        System.out.println(solution(4)); // 수박수박
    }

    public static String solution(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1;i <= n;i++)
            sb.append(i % 2 == 0 ? "박" : "수");
        return sb.toString();
    }
}
