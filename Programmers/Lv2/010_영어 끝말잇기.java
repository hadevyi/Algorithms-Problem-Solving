import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 영어 끝말잇기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12981
 *  2. 풀이핵심
 *  - 실패하는 경우(이미 말한걸 말하기 or 앞 순서의 마지막 글과 뒷 순서의 첫 글이 다른 것)를 조건문으로 세우기
 * 3. 풀이후기
 *  - 생각보다 너무 쉬운 문제, 단계만 잘 구별하면 확실함
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(Arrays.toString(solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}))); // [3, 3]
        System.out.println(Arrays.toString(solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}))); // [0, 0]
        System.out.println(Arrays.toString(solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}))); // [1, 3]
    }

    public static int[] solution(int n, String[] words) {
        int number = 1, turn = 1;
        ArrayList<String> alreadySay = new ArrayList<>();

        for (int i = 0;i < words.length;i++) {
            if (alreadySay.contains(words[i])) {
                // 이미 말했던 것을 말하는 것
                return new int[] {number, turn};
            } else if (i > 0 && (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0))) {
                // 끝말잇기가 안 된 경우
                return new int[] {number, turn};
            }

            alreadySay.add(words[i]);

            if (number == n) {
                number = 1;
                turn++;
            } else number++;
        }


        return new int[] {0, 0};
    }
}
