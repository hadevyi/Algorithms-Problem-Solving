import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 기능개발
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42586
 *  2. 풀이핵심
 *  - 기준 값을 확인하며, 그 사이의 값의 갯수를 전달함
 * 3. 풀이후기
 *  - 실제 시간 순으로 진행하려다가 이건 불필요할 정도로 소요되어, 갯수를 세며 결과를 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {93, 30, 55}, new int[] {1, 30, 5}))); // [2, 1]
        System.out.println(Arrays.toString(solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1}))); // [1, 1, 1, 1, 1, 1]
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = progresses.length, base = 0, count = 0;
        int[] days = new int[N];

        for (int n = 0;n < N;n++)
            days[n] = (100 - progresses[n]) % speeds[n] == 0 ? (100 - progresses[n]) / speeds[n] : (100 - progresses[n]) / speeds[n] + 1;

        for (int n = 0;n < N;n++) {
            if (count == 0) {
                base = days[n];
                count++;
                continue;
            }

            if (base >= days[n]) {
                count++;
            } else {
                result.add(count);
                base = days[n];
                count = 1;
            }
        }

        result.add(count);

        int idx = 0;
        int[] resultArray = new int[result.size()];
        for (int data : result)
            resultArray[idx++] = data;
        return resultArray;
    }
}
