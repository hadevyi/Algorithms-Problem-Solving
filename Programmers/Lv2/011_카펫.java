import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 카펫
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42842
 *  2. 풀이핵심
 *  - 한쪽 변을 찾으며 진행하되, 이는 총 면적의 약수 중의 하나일 것이기에, total을 만들어 우선 확인
 *  - 약수 2개 쌍을 찾을 수 있기에, 딱 절반만 찾을 수 있게 진행하기
 *  - 지금 찾은 약수 쌍의 면적으로 조건과 부합하는 지 확인하기 (노란 면적 > 갈색 면적)
 * 3. 풀이후기
 *  - 단계별로 확인하면서 진행하였으며, 갈색 면적보다 노란 면적을 구하는게 더 쉬웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(10, 2))); // [4, 3]
        System.out.println(Arrays.toString(solution(8, 1))); // [3, 3]
        System.out.println(Arrays.toString(solution(24, 24))); // [8, 6]
        System.out.println(Arrays.toString(solution(14, 4))); // [6, 3]
    }

    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for (int num = (int)Math.sqrt(total);num < total;num++) {
            if (total % num != 0) continue;
            int value1 = total / num, value2 = total / (total / num);
            int yellowArea = (value1 - 2) * (value2 - 2);
            if (yellowArea != yellow) continue;
            int brownArea = total - yellowArea;
            if (brownArea != brown) continue;
            return new int[] {Math.max(value1, value2), Math.min(value1, value2)};
        }
        return new int[] {0, 0};
    }
}
