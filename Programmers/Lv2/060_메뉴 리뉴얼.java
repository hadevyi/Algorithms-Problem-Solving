import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 메뉴 리뉴얼
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/72411
 *  2. 풀이핵심
 *  - 문제자체의 힌트가 있었음
 * 3. 풀이후기
 *  - 2개 이상의 최대 갯수를 구해서 출력
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[] {2, 3, 4}))); // ["AC", "ACDE", "BCFG", "CDE"]
        System.out.println(Arrays.toString(solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[] {2, 3, 5}))); // ["ACD", "AD", "ADE", "CD", "XYZ"]
        System.out.println(Arrays.toString(solution(new String[]{"XYZ", "XWY", "WXA"}, new int[] {2, 3, 4}))); // "WX", "XY"]
    }

    public static Map<String, Integer> map;
    public static ArrayList<String> arrayList;
    public static String[] solution(String[] orders, int[] course) {
        arrayList = new ArrayList<>();

        for (int eachCourse : course) {
            R = eachCourse;
            ARR = new int[R];
            map = new HashMap<>();
            for (String order : orders) {
                char[] chList = order.toCharArray();
                Arrays.sort(chList);
                N = order.length();
                StringBuffer sb = new StringBuffer();
                for (char ch : chList)
                    sb.append(ch);
                ORDER = sb.toString();
                combination(0, 0);
            }
            int maxValue = 0;
            for (String key : map.keySet())
                if (map.get(key) >= 2)
                    maxValue = Math.max(maxValue, map.get(key));

            for (String key : map.keySet())
                if (maxValue == map.get(key))
                    arrayList.add(key);
        }

        int index = 0;
        Collections.sort(arrayList);
        String[] answer = new String[arrayList.size()];
        for (String data : arrayList)
            answer[index++] = data;
        return answer;
    }

    public static int N, R;
    public static String ORDER;
    public static int[] ARR;
    public static void combination(int srcIdx, int tgtIdx) {
        if (tgtIdx == R) {
            getMAX();
            return;
        }

        for (int i = srcIdx;i < N;i++) {
            ARR[tgtIdx] = i;
            combination(i + 1, tgtIdx + 1);
        }
    }

    public static void getMAX() {
        StringBuffer sb = new StringBuffer();
        for (int i : ARR)
            sb.append(ORDER.charAt(i));
        String result = sb.toString();
        if (map.containsKey(result)) map.put(result, map.get(result) + 1);
        else map.put(result, 1);
    }
}
