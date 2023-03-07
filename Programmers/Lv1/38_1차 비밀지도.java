import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [1차] 비밀지도
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17681
 *  2. 풀이핵심
 *  - 이진수를 구하고, map에 표기하기
 * 3. 풀이후기
 *  - 공백을 map에 바로 기록하려고 했는데, 그럴 필요가 없었음.
 *  - null 인 경우에 출력 시 별도의 작업을 해주면 됨.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(5, new int[] {9, 20, 28, 18, 11}, new int[] {30, 1, 21, 17, 28}))); // ["#####","# # #", "### #", "# ##", "#####"]
        System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10}))); // ["######", "### #", "## ##", " #### ", " #####", "### # "]
    }

    public static String[][] map;
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        map = new String[n][n];

        for (int i = 0;i < n;i++) {
            checkSecretMap(i, n, map, readTwo(n, arr1[i]));
            checkSecretMap(i, n, map, readTwo(n, arr2[i]));
        }

        String[] answer = new String[n];
        int idx = 0;
        for (String[] m : map) {
            StringBuffer sb = new StringBuffer();
            for (String str : m)
                sb.append(str == null ? " " : str);
            answer[idx++] = sb.toString();
        }
        return answer;
    }

    public static void checkSecretMap(int idx, int n, String[][] map, String data) {
        for (int i = 0;i < n;i++)
            if (data.charAt(i) == '1' && map[idx][i] == null)
                map[idx][i] = "#";
    }

    public static String readTwo(int len, int number) {
        StringBuffer sb = new StringBuffer();
        int count = 0;

        while (number > 0) {
            sb.insert(0,number % 2);
            number = number / 2;
            count++;
        }

        for (int i = 0;i < len - count;i++)
            sb.insert(0,"0");

        return sb.toString();
    }
}
