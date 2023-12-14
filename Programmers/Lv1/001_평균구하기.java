/**
 * 1. 문제정보
 *  - 제목 : 평균 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12944
 *  2. 풀이핵심
 *  - 길이가 무관한 배열의 평균 값을 반환하는 형식
 * 3. 풀이후기
 *  - Lv0과 같은 유형이였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4})); // 2.5
        System.out.println(solution(new int[] {5, 5})); // 5
    }

    public static double solution(int[] arr) {
        double answer = 0;
        for (int data : arr)
            answer += data;
        return answer / (double) arr.length;
    }
}
