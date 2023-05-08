import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 호텔 대실
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/155651
 *  2. 풀이핵심
 *  - 문자열 구별
 * 3. 풀이후기
 *  - 시간만 정리한다면 레벨2보단 더 쉬운 문제로 생각됨
 */
public class Solution {

    public static void main(String[] args) throws Exception {

    }

    public static int N = 24*60;
    public static int[] timeTable = new int[N];
    public static int solution(String[][] book_time) {
        int answer = 0;
        for (String[] time : book_time) {
            int startTime = getTotalMin(time[0]);
            int endTime = getTotalMin(time[1]);
            endTime = endTime + 10 > N ? N : endTime + 10;

            for (int i = startTime;i < endTime;i++) {
                timeTable[i]++;
                answer = Math.max(answer, timeTable[i]);
            }
        }
        return answer;
    }

    public static int getTotalMin(String timeStr) {
        StringTokenizer st = new StringTokenizer(timeStr, ":");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        return hour * 60 + min;
    }
}
