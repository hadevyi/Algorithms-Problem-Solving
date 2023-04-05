import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : H-Index
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42747
 *  2. 풀이핵심
 *  - H index를 반환하기
 * 3. 풀이후기
 *  - 지문이해가 어려웠다. 오히려 https://www.ibric.org/myboard/read.php?Board=news&id=270333 가 더 잘 이해되었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {3, 0, 6, 1, 5})); // 3
        System.out.println(solution(new int[] {1, 4, 5})); // 2
        System.out.println(solution(new int[] {5, 6, 7})); // 3
        System.out.println(solution(new int[] {8, 10, 10, 17, 15, 24, 22, 28, 42, 47, 32})); // 10
    }

    public static int solution(int[] citations) {
        // citations : 발표한 논문의 인용 횟수를 가진 내용
        Arrays.sort(citations);
        int answer = 0;
        for (int i = citations.length - 1;i >= 0;i--) {
            if (citations[i] >= (citations.length - i))
                answer = citations.length - i;
            else break;
//            System.out.println(citations[i] + "\t" + (citations.length - i));
        }
        return answer;
    }
}
