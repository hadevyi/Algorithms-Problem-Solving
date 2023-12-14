import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 개인정보 수집 유효기간
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/150370
 *  2. 풀이핵심
 *  - 직접 날짜를 계산 하는 것이 아닌, 총 일자를 계산해 비교하는 방식을 택했음
 * 3. 풀이후기
 *  - 단계마다의 설명을 직접 구현하니 어려움이 많아 다른 방식을 택하였다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("2022.05.19", new String[] {"A 6", "B 12", "C 3"}, new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}))); // [1, 3]
        System.out.println(Arrays.toString(solution("2020.01.01", new String[] {"Z 3", "D 5"}, new String[] {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"}))); // [1, 4, 5]
        System.out.println(Arrays.toString(solution("2020.01.02", new String[] {"A 1"}, new String[] {"2020.01.02 A"}))); // []
        System.out.println(Arrays.toString(solution("2022.02.08", new String[]{"A 23"}, new String[] {"2020.01.28 A"}))); // [1]
        System.out.println(Arrays.toString(solution("2019.01.01", new String[] {"B 12"}, new String[] {"2017.12.21 B"}))); // [1]
    }

    public static Map<String, Integer> termMap;
    public static int[] solution(String today, String[] terms, String[] privacies) {
        termMap = new HashMap<>();
        for (String term : terms) {
            StringTokenizer st = new StringTokenizer(term);
            termMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int today_days = getDays(today);
        for (int i = 0;i < privacies.length;i++) {
            StringTokenizer st = new StringTokenizer(privacies[i]);
            String date = st.nextToken(), type = st.nextToken();
            if (today_days >= getDays(date) + termMap.get(type) * 28)
                arrayList.add(i + 1);
        }

        int idx = 0;
        int[] result = new int[arrayList.size()];
        for (int data : arrayList)
            result[idx++] = data;
        return result;
    }

    public static int getDays(String date) {
        StringTokenizer st = new StringTokenizer(date, ".");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        return (year * 12 * 28) + (month * 28) + day;
    }

}
