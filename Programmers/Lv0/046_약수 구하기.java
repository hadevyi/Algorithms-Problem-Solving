import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 약수 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 *  2. 풀이핵심
 *  - 약수임을 확인해 반환함
 * 3. 풀이후기
 *  - 간단하지만, 전체적인 갯수 파악이 힘들어 결과 반환은 한 번 더 작업한 것이 힘들었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(24))); // [1, 2, 3, 4, 6, 8, 12, 24]
        System.out.println(Arrays.toString(solution(29))); // [1, 29]
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1;i <= n;i++)
            if (n % i == 0)
                arrayList.add(i);

        int N = arrayList.size();
        int[] answer = new int[N];
        for (int i = 0;i < N;i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
}
