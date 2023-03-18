/**
 * 1. 문제정보
 *  - 제목 : 햄버거 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/133502
 *  2. 풀이핵심
 *  - 구간을 확인한 후, 1231의 내용이라 해당한다면 시작 인덱스 i의 i - 2에서 다시 확인함 
 * 3. 풀이후기
 *  - int 배열로 했을 때, 2가지 케이스에서 시간 초과가 발생하였음
 *  - String으로 변환해, subString을 활용해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1})); // 2
        System.out.println(solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2})); // 0
        System.out.println(solution(new int[] {1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1})); // 3
        System.out.println(solution(new int[] {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1})); // 3
        System.out.println(solution(new int[] {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1})); // 3
        System.out.println(solution(new int[] {1, 1, 2, 1, 2, 3, 1, 3, 1, 2, 3, 1})); // 3
        System.out.println(solution(new int[] {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1})); // 5
        System.out.println(solution(new int[] {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1})); // 3
        System.out.println(solution(new int[] {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1})); // 3
        System.out.println(solution(new int[] {1, 2, 2, 3, 1})); // 0
        System.out.println(solution(new int[] {2, 1, 2, 3, 1, 2, 3, 1, 1})); // 1
    }

    public static int solution(int[] ingredient) {
        // 빵(1), 야채(2), 고기(3) - 무조건 1, 2, 3, 1 이 되는 경우의 수를 세기
        StringBuffer sb = new StringBuffer();
        for (int ingredient_each : ingredient)
            sb.append(ingredient_each);
        String ingredient_str = sb.toString();

        int answer = 0;
        while (true) {
            boolean isDone = true;
            for (int i = 0;i < ingredient_str.length();i++) {
                if (ingredient_str.charAt(i) != '1') continue;
                if (i + 3 < ingredient_str.length() && ingredient_str.substring(i, i + 4).equals("1231")) {
                    answer++;
                    sb = new StringBuffer();
                    if (i + 1 < ingredient_str.length()) sb.append(ingredient_str.substring(0, i));
                    if (i + 4 < ingredient_str.length()) sb.append(ingredient_str.substring(i + 4));
                    ingredient_str = sb.toString();
                    i = i - 3 < 0 ? 0 : i - 3;
                    isDone = false;
                }
            }
            if (isDone) break;
        }


        return answer;
    }
}
