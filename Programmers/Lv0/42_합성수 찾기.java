/**
 * 1. 문제정보
 *  - 제목 : 합성수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120846
 *  2. 풀이핵심
 *  - 약수가 3개 이상이 되면 합성수이기에, 3이 나오는 순간 더 검사하지 않는다
 * 3. 풀이후기
 *  - 최대한 간단하게 구현하고자 했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10)); // 5
        System.out.println(solution(15)); // 8
    }

    public static int solution(int n) {

        int answer = 0;
        for (int i = 2;i <= n;i++) {
            int count = 1; // 1은 무조건 들어가기 떄문에
            int num = i; // 계산할 변수
            for (int data = 2;data <= num;data++)
                if (num % data == 0) {
                    count++;
                    if (count >= 3) break;
                }
            if (count >= 3) answer++;
        }
        return answer;
    }
}
