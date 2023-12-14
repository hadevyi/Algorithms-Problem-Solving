import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 요격 시스템
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181188
 *  2. 풀이핵심
 *  - e점을 기준으로 정렬한 후에 조건에 따라 검색하였다.
 * 3. 풀이후기
 *  - 테스트케이스로 주어진 내용을 모두 작성해 비교하여 보았다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}})); // 3
    }

    public static int solution(int[][] targets) {
        Arrays.sort(targets, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int answer = 1;
        int[] base = targets[0];
        for (int i = 1;i < targets.length;i++) {
            if (targets[i][0] >= base[1]) {
                base = targets[i];
                answer++;
            }
        }
        return answer;
    }
}
