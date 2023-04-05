import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 귤 고르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/138476
 *  2. 풀이핵심
 *  - 귤의 종류를 반환하기에 총 갯수를 확인할 필요없음
 * 3. 풀이후기
 *  - 작아진 순간의 이전 종류까지 고려해서 출력하면 됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3})); // 3
        System.out.println(solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3})); // 2
        System.out.println(solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3})); // 1
    }

    public static int TOTAL;
    public static Mandarin[] mandarins;
    public static int solution(int k, int[] tangerine) {
        TOTAL = tangerine.length;
        Map<Integer, Integer> MAP = new HashMap<>();

        for (int data : tangerine) {
            if (MAP.containsKey(data)) MAP.put(data, MAP.get(data) + 1);
            else MAP.put(data, 1);
        }
        int N = MAP.size(), idx = 0;
        mandarins = new Mandarin[N];
        for (int data : MAP.keySet())
            mandarins[idx++] = new Mandarin(data, MAP.get(data));
        Arrays.sort(mandarins);

        int answer = 1;
        for (int n = 0;n < N;n++) {
            if (TOTAL < k) {
                answer = N - n + 1;
                break;
            }
            TOTAL -= mandarins[n].count;
        }
        return answer;
    }

    public static class Mandarin implements Comparable<Mandarin> {
        int size;
        int count;

        public Mandarin(int size, int count) {
            this.size = size;
            this.count = count;
        }

        @Override
        public int compareTo(Mandarin o) {
            if (this.count == o.count) return this.size - o.size;
            return this.count - o.count;
        }

        @Override
        public String toString() {
            return "(" + this.size + ", " + this.count + ")";
        }
    }
}
