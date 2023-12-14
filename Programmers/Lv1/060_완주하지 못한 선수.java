import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 완주하지 못한 선수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42576
 *  2. 풀이핵심
 *  - 정확성보다 효율성을 챙기는 것이 더 어려웠던 문제
 * 3. 풀이후기
 *  - 정확성을 맞추는 방법은 많지만 효율성을 챙기는 것이 어려웠다.
 *  - 이중 for문 > Collection(ArrayList, LinkedList) > Array Sort로 돌아왔다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"})); // "leo"
        System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"})); // "vinko"
        System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"})); // "mislav"
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = "";
        for (int i = 0, j = 0;i < participant.length && j < completion.length;i++, j++) {
            if (participant[i].equals(completion[j])) continue;
            answer = participant[i];
            i--;
        }
        if (answer.length() == 0) answer = participant[participant.length - 1];
        return  answer;
    }
}
