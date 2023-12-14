import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 롤케이크 자르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/132265
 *  2. 풀이핵심
 *  - 중복되는 갯수와 종류를 확인해서 진행
 * 3. 풀이후기
 *  - me가 먹는 것과 bro가 먹는 것의 종류를 비교하는 것이 중요했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2})); // 2
        System.out.println(solution(new int[] {1, 2, 3, 1, 4})); // 0
    }

    public static int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> me = new HashMap<>();
        Map<Integer, Integer> bro = new HashMap<>();
        for (int top : topping)
            if (me.containsKey(top)) me.put(top, me.get(top) + 1);
            else me.put(top, 1);

        for (int idx = 0;idx < topping.length;idx++) {
            int now = topping[idx];

            if (me.get(now) - 1 == 0)
                me.remove(now);
            else
                me.put(now, me.get(now) - 1);

            if (bro.containsKey(now)) {
                bro.put(now, bro.get(now) + 1);
            } else bro.put(now, 1);


            if (me.size() == bro.size())
                answer++;
        }

        return answer;
    }
}
