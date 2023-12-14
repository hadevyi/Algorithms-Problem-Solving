import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [1차] 다트 게임
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17682
 *  2. 풀이핵심
 *  - 점수와 보너스, 옵션 등을 구현해서 계산하는 방법을 진행
 * 3. 풀이후기
 *  - 설명이 긴만큼 이해해서 풀이로 작성하는데 시간이 오래걸렸음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("1S2D*3T")); // 37
        System.out.println(solution("1D2S#10S")); // 9
        System.out.println(solution("1D2S0T")); // 3
        System.out.println(solution("1S*2T*3S")); // 23
        System.out.println(solution("1D#2S*3S")); // 5
        System.out.println(solution("1T2D3D#")); // -4
        System.out.println(solution("1D2S3T*")); // 59
    }

    public static int solution(String dartResult) {
        ArrayList<Dart> darts = new ArrayList<>();
        while (dartResult.length() > 0) {
            int N = dartResult.length();
            for (int n = 0 ;n < N;n++) {
                char nowCh = dartResult.charAt(n);

                if (!(nowCh == 'S' || nowCh == 'D' || nowCh == 'T')) continue;

                int plusN = 1; // default;
                if (n + 1 < N && (dartResult.charAt(n + 1) == '#' || dartResult.charAt(n + 1) == '*')) plusN++;

                int score = Integer.parseInt(dartResult.substring(0, n));
                int scoreType = dartResult.substring(n, n + 1).equals("S") ? 1 : dartResult.substring(n, n + 1).equals("D") ? 2 : 3;
                String option = plusN > 1 ? dartResult.substring(n + 1, n + 2) : null;

                darts.add(new Dart(score, scoreType, option));
                dartResult = dartResult.substring(n + plusN);
                break;
            }
        }

        int N = darts.size();
        for (int n = 0;n < N;n++) {
            if (darts.get(n).option == null) continue;
            if (darts.get(n).option.equals("*")) {
                darts.get(n).setBonusDouble();
                if (n - 1 >= 0) darts.get(n - 1).setBonusDouble();
            } else darts.get(n).setBounsMinus();
        }

        int answer = 0;
        for (Dart dart : darts)
            answer += dart.getScoreResult();
        return answer;
    }

    public static class Dart {
        int basicScore;
        int scoreType;
        String option;
        int bonus; // 없으면 1이여야 함

        public Dart(int basicScore, int scoreType, String option) {
            this.basicScore = basicScore;
            this.scoreType = scoreType;
            this.option = option;
            this.bonus = 1;
        }

        public int getScoreResult() {
            return (int) Math.pow(this.basicScore, this.scoreType) * this.bonus;
        }

        public void setBonusDouble() {
            this.bonus *= 2;
        }

        public void setBounsMinus() {
            this.bonus *= -1;
        }

        @Override
        public String toString() {
            return "basicScore : " + basicScore
                    + "\tscoreType : " + scoreType
                    + "\tbonus : " + bonus
                    + "\toption : " + option;
        }
    }
}
