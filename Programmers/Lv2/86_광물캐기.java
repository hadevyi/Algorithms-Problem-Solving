import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 광물 캐기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/172927
 *  2. 풀이핵심
 *  - 범위 내 구간 별 우선순위 처리
 * 3. 풀이후기
 *  - 직접 접근해서 구현하였으나, 적절한 정답이 나오지 않았다. 구간별 최대를 주고 우선 순위로 처리할 수 있었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 3, 2}, new String[] {"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"})); // 12
        System.out.println(solution(new int[] {0, 1, 1}, new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"})); // 50
        System.out.println(solution(new int[] {1, 1, 1}, new String[] {"stone", "iron", "iron", "stone", "iron", "diamond"})); // 6
        System.out.println(solution(new int[] {1, 0, 1}, new String[] {"iron", "iron", "iron", "iron", "diamond", "diamond", "diamond"})); // 47
        System.out.println(solution(new int[] {0, 0, 0}, new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"})); // 0
        System.out.println(solution(new int[] {1, 0, 0}, new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"})); // 5
        System.out.println(solution(new int[] {0, 0, 1}, new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"})); // 125
        System.out.println(solution(new int[] {1, 0, 1}, new String[] {"stone", "stone", "stone", "stone", "stone", "iron", "iron", "iron", "iron", "iron", "diamond", "diamond"})); // 10
        System.out.println(solution(new int[] {5, 5, 5}, new String[] {"diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond"})); // 150
        System.out.println(solution(new int[] {0, 1, 0}, new String[] {"diamond", "iron", "iron", "iron", "iron", "diamond", "diamond", "iron", "iron", "iron"})); // 9
    }

    public static int TOTAL;
    public static Map<String, Integer> map = new HashMap<>() {{
        put("diamond", 0); put("iron", 1); put("stone", 2);
    }};
    public static int[][] pickToMineral = {
        {1, 1, 1},
        {5, 1, 1},
        {25, 5, 1}
    };
    public static PriorityQueue<Data> pq = new PriorityQueue<>();
    public static int solution(int[] picks, String[] minerals) {
        for (int pick : picks)
            TOTAL += pick;
        
        if (TOTAL == 0) return 0; // 곡괭이가 없으면 0으로 종료
        
        int index = 0;
        while (true) {
            if (index >= minerals.length) break; // 광물이 끝나면
            if (TOTAL == 0) break; // 곡괭이가 끝나면
            
            int startIdx = index, len = 0, sum = 0;
            for (int i = 0, idx = index;i < 5 && idx < minerals.length;i++, idx++) {
                len++;
                sum += pickToMineral[2][map.get(minerals[idx])];
            }
            
            pq.offer(new Data(startIdx, len, sum));
            
            TOTAL--;
            index = index + 5 < minerals.length ? index + 5 : minerals.length;
        }
        
        int answer = 0;
        while (!pq.isEmpty()) {
            Data data = pq.poll();
            int pickIdx = getNextPick(picks);
            for (int i = data.startIdx;i < data.startIdx + data.len;i++) 
                answer += pickToMineral[pickIdx][map.get(minerals[i])];
            picks[pickIdx]--;
        }
        return answer;
    }
    
    public static int getNextPick(int[] picks) {
        for (int i = 0;i < picks.length;i++) {
            if (picks[i] > 0)
                return i;
        }
        return -1;
    }
    
    public static class Data implements Comparable<Data> {
        int startIdx;
        int len;
        int sum;
        public Data(int startIdx, int len, int sum) {
            this.startIdx = startIdx;
            this.len = len;
            this.sum = sum;
        }
        @Override
        public int compareTo(Data o) {
            if (this.sum == o.sum)
                return this.startIdx - o.startIdx;
            return o.sum - this.sum;
        }
    }
}
