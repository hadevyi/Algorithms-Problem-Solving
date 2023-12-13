import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 정렬하기 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120850
 *  2. 풀이핵심
 *  - 숫자만 추출해 정렬함
 * 3. 풀이후기
 *  - 문자열의 구성을 하나하나 확인하며 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("hi12392"))); // [1, 2, 2, 3, 9]
        System.out.println(Arrays.toString(solution("p2o4i8gj2"))); // [2, 2, 4, 8]
        System.out.println(Arrays.toString(solution("abcde0"))); // [0]
    }

    public static int[] solution(String my_string) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = my_string.length();

        for (int n = 0;n < N;n++)
            if ('0' <= my_string.charAt(n) && my_string.charAt(n) <= '9')
                arrayList.add(my_string.charAt(n) - '0');

        int Len = arrayList.size();
        Collections.sort(arrayList);
        int[] answer = new int[Len];
        int idx = 0;
        for (int len = 0;len < Len;len++)
            answer[idx++] = arrayList.get(len);
        return answer;
    }
}
