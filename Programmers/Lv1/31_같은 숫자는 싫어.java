import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 같은 숫자는 싫어
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12906
 *  2. 풀이핵심
 *  - 중복방지가 아닌 연속방지이기에 맨 뒤에 값만 확인하면 됨
 * 3. 풀이후기
 *  - 크기를 가늠할 수 없기에, ArrayList를 사용함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 1, 3, 3, 0, 1, 1}))); // [1, 3, 0, 1]
        System.out.println(Arrays.toString(solution(new int[] {4, 4, 4, 3, 3}))); // [4, 3]
    }

    public static int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int data : arr)
            if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) != data)
                arrayList.add(data);

        int N = arrayList.size(), idx = 0;
        int[] answer = new int[N];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}
