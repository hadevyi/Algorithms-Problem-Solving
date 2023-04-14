import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [3차] 압축
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17684
 *  2. 풀이핵심
 *  - 사전을 Map으로 만들어서 진행함
 * 3. 풀이후기
 *  - 있으면, index를 출력하고 없으면 다음 글자와 함께 추가하는 방식을 했다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("KAKAO"))); // [11, 1, 27, 15]
        System.out.println(Arrays.toString(solution("TOBEORNOTTOBEORTOBEORNOT"))); // [20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
        System.out.println(Arrays.toString(solution("ABABABABABABABAB"))); // 	[1, 2, 27, 29, 28, 31, 30]
    }
    public static Map<String, Integer> map;
    public static ArrayList<Integer> arrayList;
    public static int[] solution(String msg) {
        map = new HashMap<>();
        arrayList = new ArrayList<>();
        // 사전 초기화
        for (int i = 0;i < 26;i++)
            map.put(Character.toString((char)('A' + i)), i + 1);

        while (msg.length() > 0) {
            String nowInput = findNowInput(msg);
            int nowInputLength = nowInput.length();
            arrayList.add(map.get(nowInput));
            if (nowInputLength + 1 <= msg.length())
                map.put(msg.substring(0, nowInputLength + 1), map.size() + 1);
            msg = msg.substring(nowInputLength);
        }


        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }

    public static String findNowInput(String msg) {
        String result = "";

        for (int i = 1;i <= msg.length();i++) {
            String substring = msg.substring(0, i);

            if (map.containsKey(substring))
                result = substring;
            else
                break;
        }

        return result;
    }
}
