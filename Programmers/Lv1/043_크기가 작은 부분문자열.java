import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 크기가 작은 부분문자열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
 *  2. 풀이핵심
 *  - 부분 문자열을 구하는 문제
 * 3. 풀이후기
 *  - t의 길이가 최대 10,000이 되기에 int보다 더 넓은 것을 써야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("3141592", "271")); // 2
        System.out.println(solution("500220839878", "7")); // 8
        System.out.println(solution("10203", "15")); // 3
        System.out.println(solution("1221351118575141528544", "12511")); // 3
    }

    public static ArrayList<String> arrayList;

    public static int solution(String t, String p) {
        arrayList = new ArrayList<>();
        int tN = t.length(), pN = p.length();

        for (int i = 0;i <= tN - pN;i++)
            arrayList.add(t.substring(i, i + pN));

        int answer = 0;
        for (String str : arrayList)
            if (Long.parseLong(str) <= Long.parseLong(p))
                answer++;
        return answer;
    }
}
