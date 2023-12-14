import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 연속 부분 수열 합의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131701
 *  2. 풀이핵심
 *  - 결과의 중복이 없도록하기
 * 3. 풀이후기
 *  - 진행은 간단하게 할 수 있었으나 arraylist contaniners를 해서 시간 초과가 발생, Set으로 바꿔서 해결함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {7, 9, 1, 1, 4})); // 18
    }

    public static int N;
    public static int[] result;
    public static Set<Integer> set;
    public static int solution(int[] elements) {
        N = elements.length;
        result = new int[N];
        set = new HashSet<>();
        int i = 0;

        for (int reap = 0;reap < N;reap++) {
            for (int idx = i, count = 0;count < N;count++, idx = idx + 1 >= N ? 0: idx + 1)
                result[count] += elements[idx];
            i++;

            for (int r : result)
                set.add(r);
        }

        return set.size();
    }
}
