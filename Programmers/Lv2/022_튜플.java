import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 튜플
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/64065
 *  2. 풀이핵심
 *  - 원소들의 정렬 기준 확인하기
 * 3. 풀이후기
 *  - 빈도수에 따라 중복없이 순서대로 출력하는 것을 확인할 수 있어야 한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"))); // [2, 1, 3, 4]
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"))); // [2, 1, 3, 4]
        System.out.println(Arrays.toString(solution("{{20,111},{111}}"))); // [111, 20]
        System.out.println(Arrays.toString(solution("{{123}}"))); // [123]
        System.out.println(Arrays.toString(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))); // [3, 2, 4, 1]
    }

    public static int[] solution(String s) {
        // s : 중복 원소가 없는 튜플
        ArrayList<Tuple> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, "},{");
        int N = st.countTokens();

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());
            if (isExist(arrayList, num)) plus(arrayList, num);
            else arrayList.add(new Tuple(num));
        }

        Collections.sort(arrayList);
        int idx = 0;
        N = arrayList.size();
        int[] answer = new int[N];
        for (Tuple t : arrayList)
            answer[idx++] = t.num;
        return answer;
    }

    public static boolean isExist(ArrayList<Tuple> arrayList, int num) {
        for (Tuple t : arrayList)
            if (t.num == num)
                return true;
        return false;
    }

    public static void plus(ArrayList<Tuple> arrayList, int num) {
        for (Tuple t : arrayList)
            if (t.num == num)
                t.setNumPlus();
    }

    public static class Tuple implements Comparable<Tuple> {
        int num;
        int count;

        public Tuple(int num) {
            this.num = num;
            this.count = 1;
        }

        public void setNumPlus() {
            this.count += 1;
        }

        @Override
        public int compareTo(Tuple o) {
            if (this.count == o.count) return this.num - o.num;
            return o.count - this.count;
        }
    }
}
