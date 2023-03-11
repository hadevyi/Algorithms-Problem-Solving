import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 개 뽑아서 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68644
 *  2. 풀이핵심
 *  - 자기 자신과의 합을 제외한 모든 경우의 수를 정렬함
 * 3. 풀이후기
 *  - 얼마만큼의 원소가 나올지 모르기에 ArrayList를 활용했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 3, 4, 1}))); // [2,3,4,5,6,7]
        System.out.println(Arrays.toString(solution(new int[] {5, 0, 2, 7}))); // [2,5,7,9,12]
    }

    public static int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int N = numbers.length;

        for (int i = 0;i < N;i++)
            for (int j = 0;j < N;j++) {
                if (i == j) continue;
                if (!arrayList.contains(numbers[i] + numbers[j]))
                    arrayList.add(numbers[i] + numbers[j]);
            }

        int Len = arrayList.size(), idx = 0;
        int[] answer = new int[Len];
        for (int data : arrayList)
            answer[idx++] = data;
        Arrays.sort(answer);
        return answer;
    }
}
