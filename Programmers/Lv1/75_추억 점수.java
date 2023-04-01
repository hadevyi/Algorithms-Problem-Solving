import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 추억 점수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/176963
 *  2. 풀이핵심
 *  - 1 : 1로 매칭에 진행함
 * 3. 풀이후기
 *  - name이 중복이 없음이 보장되어 있어서 가능하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"may", "kein", "kain", "radi"}, new int[] {5, 10, 1, 3}, new String[][] {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}))); // [19, 15, 6]
        System.out.println(Arrays.toString(solution(new String[] {"kali", "mari", "don"}, new int[] {11, 1, 55}, new String[][] {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}))); // [67, 0, 55]
        System.out.println(Arrays.toString(solution(new String[] {"may", "kein", "kain", "radi"}, new int[] {5, 10, 1, 3}, new String[][] {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}}))); // [5, 15, 0]
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearning = new HashMap<>();
        int N = name.length, M = photo.length;

        for (int n = 0;n < N;n++)
            nameYearning.put(name[n], yearning[n]);

        int[] answer = new int[M];

        for (int m = 0;m < M;m++) {
            int result = 0;
            String[] check = photo[m];

            for (String checkName : check) {
                if (!nameYearning.containsKey(checkName)) continue;
                result += nameYearning.get(checkName);
            }

            answer[m] = result;
        }

        return answer;
    }
}
