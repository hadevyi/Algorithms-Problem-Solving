import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 위장
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42578
 *  2. 풀이핵심
 *  - 별도로 모든 경우를 찾기보다는 한번에 찾는 방법을 고민
 * 3. 풀이후기
 *  - 각 경우의 수에 안입는 경우를 + 1하고, 전체 결과에서 모두 안 입는 경우를 -1 한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}})); // 5
        System.out.println(solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}})); // 3
    }

    public static int COUNT;
    public static Map<String, Integer> clothesMap;
    public static int solution(String[][] clothes) {
        clothesMap = new HashMap<>();
        for (String[] clothesEach : clothes) {
            if (clothesMap.containsKey(clothesEach[1])) {
                clothesMap.put(clothesEach[1], clothesMap.get(clothesEach[1]) + 1);
            } else {
                clothesMap.put(clothesEach[1], 1); // 안 입는 경우를 위해 + 1
            }
        }

        COUNT = 1;
        for (String key : clothesMap.keySet()) {
            COUNT *= clothesMap.get(key) + 1;
        }
        return COUNT - 1;
    }
}
