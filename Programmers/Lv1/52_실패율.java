import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 실패율
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42889
 *  2. 풀이핵심
 *  - 이전 값에 대해서 확인하고 진행해야하는 문제
 * 3. 풀이후기
 *  - 정렬을 위해 간단한 static class를 만들어서 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}))); // [3,4,2,1,5]
        System.out.println(Arrays.toString(solution(4, new int[] {4,4,4,4,4}))); // [4,1,2,3]
    }

    public static int[][] stagesData; // 0 failNum, 1 tryNum;
    public static int[] solution(int N, int[] stages) {
        // 실패율 = 아직 클리어하지 못한 플레이어 수 / 도달한 플레이어 수
        stagesData = new int[N + 2][2]; // 0 dummy, N + 1은 마지막 스테이지까지 통과한 사람

        for (int n = N + 1;n > 0;n--) {
            stagesData[n][1] = countNumber(n, stages);
            if (n == N + 1) stagesData[n][0] = stagesData[n][1];
            else stagesData[n][0] = stagesData[n + 1][0] + stagesData[n][1];
        }

        int idx = 0;
        FailPercent[] failPercents = new FailPercent[N];
        for (int i = 1;i < N + 1;i++)
            failPercents[idx++] = new FailPercent(i, stagesData[i][0], stagesData[i][1]);

        Arrays.sort(failPercents);

//        for (int[] stageData: stagesData)
//            System.out.println(Arrays.toString(stageData));
//
//        for (FailPercent failPercent : failPercents)
//            System.out.println(failPercent);

        // 실패율이 같은 경우 작은 번호가 앞에 오도록
        idx = 0;
        int[] answer = new int[N];
        for (FailPercent failPercent : failPercents)
            answer[idx++] = failPercent.stageNum;
        return answer;
    }

    public static int countNumber(int num, int[] stages) {
        int count = 0;
        for (int stage : stages)
            if (stage == num)
                count++;
        return count;
    }

    public static class FailPercent implements Comparable<FailPercent> {
        public int stageNum;
        public double failPer;

        public FailPercent(int stageNum, int failNum, int tryNum) {
            this.stageNum = stageNum;
            this.failPer = tryNum == 0 ? 0 : (double) tryNum / (double) failNum;
        }

        @Override
        public int compareTo(FailPercent o) {
            if (this.failPer == o.failPer)
                return this.stageNum - o.stageNum;
            return o.failPer - this.failPer > 0 ? 1 : -1;
        }

        @Override
        public String toString() {
            return "stageNum : " + this.stageNum + "\tfailPer : " + this.failPer;
        }
    }
}
