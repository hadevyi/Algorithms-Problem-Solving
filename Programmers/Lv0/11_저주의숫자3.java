/**
 * 1. 문제정보
 *  - 제목 : 저주의 숫자 3
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120871
 *  2. 풀이핵심
 *  - 제외조건에 따른 변환 결과 출력
 * 3. 풀이후기
 *  - 직접 정의내리는 data 배열을 구성했다가, 런타임 에러로 결과
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int N = 100;
    public static int solution(int n) {
        // 제외 : n이 3의 배수 or 3이 들어간 수
        return getData(n);
    }

    public static int getData(int lastNum) {
        int idx = 1; // 횟수 (lastNum까지)
        int num = 0; // 숫자 (제외 조건 잘 확인하기)

        while (true) {
            num++;
            if (num % 3 == 0 || Integer.toString(num).contains("3")) continue;
            if (idx == lastNum) return num;
            idx++;
        }
    }
}