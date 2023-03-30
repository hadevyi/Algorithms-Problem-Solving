/**
 * 1. 문제정보
 *  - 제목 : 다음 큰 숫자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12911
 *  2. 풀이핵심
 *  - 이진수로 변환하며 1을 세고, 그 다음의 가장 큰 수를 반환함
 * 3. 풀이후기
 *  - 간단한 단계별 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(78)); // 83
        System.out.println(solution(15)); // 23
    }

    public static int solution(int n) {
        int answer = 0, oneCount = countOne(n);
        while (true) {
            if (oneCount == countOne(++n)) {
                answer = n;
                break;
            }
        }
        return answer;
    }

    public static int countOne(int num) {
        int count = 0;
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
            if (num % 2 == 1) count++;
            num = num / 2;
        }
        return count;
    }
}
