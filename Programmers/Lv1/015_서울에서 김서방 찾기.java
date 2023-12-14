/**
 * 1. 문제정보
 *  - 제목 : 서울에서 김서방 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12919
 *  2. 풀이핵심
 *  - 해당하는 인덱스를 찾기
 * 3. 풀이후기
 *  - 간단한 반복문으로 가능
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"Jane", "Kim"})); // 김서방은 1에 있다
    }

    public static String solution(String[] seoul) {
        StringBuffer sb = new StringBuffer();
        int idx = 0, N = seoul.length;

        for (int n = 0;n < N;n++) {
            if (seoul[n].equals("Kim"))
                idx = n;
        }

        return sb.append("김서방은 ").append(idx).append("에 있다").toString();
    }
}
