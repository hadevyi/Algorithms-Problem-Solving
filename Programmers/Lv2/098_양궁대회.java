import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 양궁대회
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92342
 *  2. 풀이핵심
 *  - 브루트포스로 모든 경우의 수를 진행함
 * 3. 풀이후기
 *  - 길이가 11개로 고정이고 이에 대해 모두 작성해서 진행하였음
 */
class Solution {
    public int LEN = 11;
    public List<boolean[]> checkList = new ArrayList<>();
    public int[] solution(int n, int[] info) {
        PriorityQueue<Check> pq = new PriorityQueue<>();
        combination(0);
        
        for (boolean[] check : checkList) {
            int remain = n;
            int[] ryan = new int[LEN];
            
            // setting ryan value
            for (int len = 0;len < LEN - 1;len++) {
                if (!check[len]) continue;
                if (remain <= 0) break;
                
                if (info[len] + 1 <= remain) {
                    ryan[len] = info[len] + 1;
                    remain -= info[len] + 1;
                } else {
                    ryan[len] = remain;
                    remain = 0;
                }
            }
            if (check[LEN - 1] && remain > 0) ryan[LEN - 1] = remain;
            
            // calculrate score
            int aScore = 0, rScore = 0;
            for (int idx = 0;idx < LEN;idx++) {
                if (info[idx] == 0 && ryan[idx] == 0) continue;
                if (info[idx] >= ryan[idx]) aScore += 10 - idx;
                else rScore += 10 - idx;
            }
            
            // pq offer if ryan win
            if (rScore > aScore) pq.offer(new Check(rScore - aScore, ryan));
        }
           
        if (pq.isEmpty()) return new int[] {-1};
        Check check = pq.poll();
        return check.array;
    }
    
    public boolean[] ARR = new boolean[LEN];
    public void combination(int idx) {
        if (idx == LEN) {
            checkList.add(ARR.clone());
            return;
        }
        
        ARR[idx] = true;
        combination(idx + 1);
        ARR[idx] = false;
        combination(idx + 1);
    }
    
    public class Check implements Comparable<Check> {
        int scoreGap;
        int[] array;
        public Check(int scoreGap, int[] array) {
            this.scoreGap = scoreGap;
            this.array = array.clone();
        }
        @Override
        public int compareTo(Check o) {
            if (this.scoreGap == o.scoreGap) {
                for (int n = this.array.length - 1;n >= 0;n--) {
                    if (this.array[n] != o.array[n])
                        return o.array[n] - this.array[n];
                }
            }
            return o.scoreGap - this.scoreGap;
        }
    }
}