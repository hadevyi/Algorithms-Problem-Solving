import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 우박수열 정적분
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/134239
 *  2. 풀이핵심
 *  - 사다리꼴 넓이 구하기
 * 3. 풀이후기
 *  - 콜라츠 추측이라고도 하는데, 이에 대한 각 넓이를 구하는 공식 (윗변 + 아래변) * 높이 * 0.5 이 필요했다.
 *  - 부가적으로 주어진 range가 어떻게 사용되는 것이 어려웠다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(5, new int[][] {{0,0},{0,-1},{2,-3},{3,-3}}))); // [33.0,31.5,0.0,-1.0]
    }

    public static int S, E;
    public static int[] point;
    public static double[] pointArea;
    public static double[] solution(int k, int[][] ranges) {
        settingPoint(k);
        double[] answer = new double[ranges.length];
        for (int i = 0;i < ranges.length;i++) {
            int start = S + ranges[i][0];
            int end = E + ranges[i][1];

            double result = 0.0;

            for (int j = start;j < end;j++)
                result += pointArea[j];

            answer[i] = start > end ? -1.0 : result;
        }
        return answer;
    }

    public static void settingPoint(int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(num);

        while (num > 1) {
            if (num % 2 == 0) {
                arrayList.add(num / 2);
                num = num / 2;
            } else {
                arrayList.add(num * 3 + 1);
                num = num * 3 + 1;
            }
        }

        point = new int[arrayList.size()];
        for (int i = 0;i < arrayList.size();i++)
            point[i] = arrayList.get(i);

        pointArea = new double[point.length - 1];
        for (int i = 0;i < pointArea.length;i++)
            pointArea[i] = (point[i] + point[i + 1]) * 0.5;
        E = pointArea.length;
    }
}
