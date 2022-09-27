import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 애너그램 
 *  - 번호 : 6996
 *  - 링크 : https://www.acmicpc.net/problem/6996
 *  2. 풀이핵심
 *  - 정해진 함수 완성하기
 * 3. 풀이후기
 *  - 구성된 횟수와 종류가 중요하기에 모두 확인
 */
public class Main {

    private static boolean solveAnagrams(String first, String second ) {
        int[] alpha = new int[26];
        int LEN = first.length();

        // str1 check
        for (int i = 0;i < LEN;i++) alpha[first.charAt(i) - 'a']++;

        // str2 check
        LEN = second.length();
        for (int i = 0;i < LEN;i++) alpha[second.charAt(i) - 'a']--;

        for (int i = 0;i < 26;i++) {
            if (alpha[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}