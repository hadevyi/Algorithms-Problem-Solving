import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 공원 산책
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/172928
 *  2. 풀이핵심
 *  - ESWN 순의 좌표값 매칭, 해당 방향 중의 이동이 불가하면 무효화하기
 * 3. 풀이후기
 *  - 기본 데이터만 잘 잡아주면 그렇게 어렵지는 않은 문제였다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"SOO","OOO","OOO"}, new String[] {"E 2","S 2","W 1"}))); // [2, 1]
        System.out.println(Arrays.toString(solution(new String[] {"SOO","OXX","OOO"}, new String[] {"E 2","S 2","W 1"}))); // [0, 1]
        System.out.println(Arrays.toString(solution(new String[] {"OSO","OOO","OXO","OOO"}, new String[] {"E 2","S 3","W 1"}))); // [0, 0]
    }

    public static int H, W;
    public static char[][] map;
    public static Map<String, int[]> dirMap = new HashMap<>() {{
        put("N", new int[] {-1, 0}); put("S", new int[] {1, 0});
        put("W", new int[] {0, -1}); put("E", new int[] {0, 1});
    }};
    public static int[] solution(String[] park, String[] routes) {
        H = park[0].length();
        W = park.length;
        map = new char[W][H];
        int nowH = 0, nowW = 0;

        for (int w = 0;w < W;w++)
            for (int h = 0;h < H;h++) {
                char now = park[w].charAt(h);
                map[w][h] = now;
                if (now == 'S') {
                    nowW = w;
                    nowH = h;
                }
            }

        for (String route : routes) {
            StringTokenizer st = new StringTokenizer(route);
            String direct = st.nextToken();
            Integer length = Integer.parseInt(st.nextToken());
            int tempW = nowW, tempH = nowH;
            boolean valueChane = false;

            for (int i = 0;i < length;i++) {
                tempW += dirMap.get(direct)[0];
                tempH += dirMap.get(direct)[1];

                if (tempW >= W || tempH >= H || tempH < 0 || tempW < 0 || map[tempW][tempH] == 'X') break;

                if (i + 1 == length) valueChane = true;
            }

            if (valueChane) {
                nowW = tempW;
                nowH = tempH;
            }
        }

        return new int[] {nowW, nowH};
    }
}
