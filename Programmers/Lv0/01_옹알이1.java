/**
 * 1. 문제정보
 *  - 제목 : 옹알이(1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
 *  2. 풀이핵심
 *  - 알맞는 조건에 따른 문자열 구성 확인하기
 * 3. 풀이후기
 *  - 해당하는 부분을 임의의 문자열로 치환한 후 검사는 임의의 문자열을 제외하여 진행함
 *  - 현재 문제의 입력이 영소문자로만 구성하기에 가능한 구조였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"})); // 1
        System.out.println(solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})); // 3
    }

    // 기준이 되는 문자열 리스트
    static String[] list = new String[] {"aya", "ye", "woo", "ma"};
    static int N = 4;

    public static int solution(String[] babbling) {
        int len = babbling.length;
        for (int i = 0;i < len;i++) {
            for (int n = 0;n < N;n++) {
                if (babbling[i].contains(list[n])) {
                    babbling[i] = babbling[i].replace(list[n], " ");
                }
            }
        }

        int answer = 0;
        for (int i = 0;i < len;i++) {
            if (babbling[i].replace(" ", "").length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}