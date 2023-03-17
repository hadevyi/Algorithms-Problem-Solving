import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [카카오 인턴] 키패드 누르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/67256
 *  2. 풀이핵심
 *  - 기본 데이터 정리가 명확히 필요한 내용
 * 3. 풀이후기
 *  - Point와 Pad를 정의한 후 진행하였으며, Point-Point의 길이를 구하는 함수를 별도로 진행함
 *  -
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right")); // LRLLLRLLRRL
        System.out.println(solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left")); // LRLLRRLLLRR
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right")); // LLRLLRLLRL
    }

    static String defaultHands;
    static Point nowLeft; // new Point(0, 3);
    static Point nowRight; // new Point(2, 3);
    static Map<Integer, Pad> map = new HashMap<>() {{
       put(1, new Pad(0, 0, "L")); put(2, new Pad(1, 0, "?")); put(3, new Pad(2, 0, "R"));
       put(4, new Pad(0, 1, "L")); put(5, new Pad(1, 1, "?")); put(6, new Pad(2, 1, "R"));
       put(7, new Pad(0, 2, "L")); put(8, new Pad(1, 2, "?")); put(9, new Pad(2, 2, "R"));
       put(0, new Pad(1, 3, "?"));
    }};
    public static String solution(int[] numbers, String hand) {
        // default data
        nowLeft = new Point(0, 3);
        nowRight = new Point(2, 3);
        defaultHands = hand.equals("left") ? "L" : "R";

        StringBuffer sb = new StringBuffer();
        for (int number : numbers) {
            if (map.get(number).hand.equals("?")) {
                int leftLength = getLength(nowLeft, map.get(number).p);
                int rightLength = getLength(nowRight, map.get(number).p);

                if (leftLength == rightLength) {
                    sb.append(defaultHands);
                    if (defaultHands.equals("L")) nowLeft = map.get(number).p;
                    else nowRight = map.get(number).p;
                } else if (leftLength < rightLength) {
                    sb.append("L");
                    nowLeft = map.get(number).p;
                } else {
                    sb.append("R");
                    nowRight = map.get(number).p;
                }
            } else {
                // LR이 명확한 경우
                if (map.get(number).hand.equals("L"))
                    nowLeft = map.get(number).p;
                else nowRight = map.get(number).p;
                sb.append(map.get(number).hand);
            }
        }
        return sb.toString();
    }

    public static int getLength(Point p1, Point p2) {
        return Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y);
    }

    static class Pad {
        Point p;
        String hand;

        public Pad(int x, int y, String hand) {
            this.p = new Point(x, y);
            this.hand = hand;
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
