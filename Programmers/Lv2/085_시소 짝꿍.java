import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 시소 짝꿍
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/152996
 *  2. 풀이핵심
 *  - 데이터 형변환 및 대칭 확인
 * 3. 풀이후기
 *  - 풀이 접근에도 오래걸렸지만, 데이터 변환을 하지않아 틀린 시간이 길었다..
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {100, 180, 360, 100, 270})); // 4
    }

    public static long solution(int[] weights) {
        Arrays.sort(weights);
        Map<Double, Integer> mapList = new HashMap<>();
        for (int weight : weights) {
            double newWeight = (double) weight;
            if (mapList.containsKey(newWeight)) mapList.put(newWeight, mapList.get(newWeight) + 1);
            else mapList.put(newWeight, 1);
        }

        long answer = 0;
        for (double key : mapList.keySet()) {
            long value = (long) mapList.get(key);
            if (value > 1) answer += (value * (value - 1)) / 2;
            if (mapList.containsKey(key * 2 / 3)) answer += value * mapList.get(key * 2 / 3);
            if (mapList.containsKey(key * 2 / 4)) answer += value * mapList.get(key * 2 / 4);
            if (mapList.containsKey(key * 3 / 4)) answer += value * mapList.get(key * 3 / 4);
        }

        return answer;
    }
}
