import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 점프와 순간 이동
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12980
 *  2. 풀이핵심
 *  - 자연수 k 만큼 뛸 수 있지만, 결국 2배로 뛰는 것이 효율적이기에 1아니면 2배로만 가능하다.
 * 3. 풀이후기
 *  - 홀/짝수의 결과에 대해서 1칸 이동하거나 2배 뛰는 것을 선택할 수 있었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(5)); // 2
        System.out.println(solution(6)); // 2
        System.out.println(solution(5000)); // 5
    }

    public static int solution(int n) {
        int answer = 0;

        for (char ch : Integer.toBinaryString(n).toCharArray())
            if (ch == '1')
                answer++;

        return answer;
    }
}
