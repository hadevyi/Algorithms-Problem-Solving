/**
 * 1. 문제정보
 *  - 제목 : 둘만의 암호
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/155652
 *  2. 풀이핵심
 *  - skip의 문자열의 최대는 10, 영문은 총 26이기에 대상은 16까지는 있음.
 *  - 하지만 index는 20까지 있기에 돌아가는 것이 1번 안에 안 끝날 수도 있음.
 * 3. 풀이후기
 *  - 여러번 돌 수 있는 경우를 생각하지 못했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("aukks", "wbqd", 5)); // happy
        System.out.println(solution("abcde", "qrstuvwxyz", 20)); //
        // abcdefghijklmnop qrstuvwxyz
    }

    public static String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < 26;i++) sb.append((char)('a' + i));
        String alpha = sb.toString();

        for (char ch : skip.toCharArray())
            alpha = alpha.replace(Character.toString(ch), "");

        char[] alpha_list = alpha.toCharArray();
        sb = new StringBuffer();

        for (char ch : s.toCharArray()) {
            sb.append(alpha_list[getIndex(ch, index, alpha_list)]);
        }

        return sb.toString();
    }

    public static int getIndex(char ch, int index, char[] alpha_list) {
        int idx = 0;
        for (int i = 0;i < alpha_list.length;i++)
            if (ch == alpha_list[i])
                idx = i;
        idx += index;
        while (idx >= alpha_list.length) {
            idx = idx - alpha_list.length;
        }
        return idx;
    }
}
