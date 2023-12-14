import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [1차] 캐시
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17680
 *  2. 풀이핵심
 *  - LRU의 방식을 이해해야 함
 * 3. 풀이후기
 *  - Hit하면 그 내용은 맨 앞으로 이동해야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})); // 50
        System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})); // 21
        System.out.println(solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})); // 60
        System.out.println(solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})); // 52
        System.out.println(solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"})); // 16
        System.out.println(solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})); // 25
    }

    public static int SIZE;
    public static ArrayList<String> arrayList;
    public static int solution(int cacheSize, String[] cities) {
        SIZE = cacheSize;
        int answer = 0, N = cities.length;
        arrayList = new ArrayList<>();

        for (int n = 0;n < N;n++) {
            String nowCity = changeLowCase(cities[n]);

            if (arrayList.contains(nowCity)) {
                answer += 1;
                ChangeOrder(nowCity);
            } else {
                answer += 5;
                LRU(nowCity);
            }
        }

        return answer;
    }

    public static void ChangeOrder(String nowCity) {
        ArrayList<String> temp = new ArrayList<>();
        for (String city : arrayList)
            if (!city.equals(nowCity))
                temp.add(city);
        temp.add(nowCity);
        arrayList = temp;
    }

    public static String changeLowCase(String city) {
        StringBuffer sb = new StringBuffer();
        for (char ch : city.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') sb.append((char)('a' - 'A' + ch));
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void LRU(String city) {
        if (SIZE == 0) return;
        if (arrayList.size() == SIZE) {
            arrayList.remove(0);
            arrayList.add(city);
        } else {
            arrayList.add(city);
        }
    }
}
