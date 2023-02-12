/**
 * 1. 문제정보
 *  - 제목 : 영어가 싫어요
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120894
 *  2. 풀이핵심
 *  - 문제의 원하는 바가 아닌 것같지만, String의 method로 해결하였음
 * 3. 풀이후기
 *  - 원하는 return 값으로 변환하는 단계만 거치고 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("onetwothreefourfivesixseveneightnine")); // 123456789
        System.out.println(solution("onefourzerosixseven")); // 14067
    }

    public static long solution(String numbers) {
        String[][] numberData = {{"zero", "0"}, {"one", "1"}, {"two", "2"}, {"three", "3"}, {"four", "4"}, {"five", "5"}, {"six", "6"}, {"seven", "7"}, {"eight", "8"}, {"nine", "9"}};
        int N = 10;

        for (int n = 0;n < N;n++)
            numbers = numbers.replaceAll(numberData[n][0], numberData[n][1]);

        return Long.parseLong(numbers);
    }
}
