import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 대충 만든 자판
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/160586
 *  2. 풀이핵심
 *  - 단계별로 구별하는 것이 중요했음
 * 3. 풀이후기
 *  - 초기화 : 키들이 갖고 있는 영문자 boolean 배열 초기화 및 키마다 갖고 있는 알파벳의 인덱스
 *  - 조건확인 : target을 key로 표한할 수 있는지 확인
 *  - 조건의 만족하는 경우 모든 키들 중의 가장 앞에 있는 값을 전달해 합해서 결과 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"}))); // [9, 4];
        System.out.println(Arrays.toString(solution(new String[]{"AA"}, new String[]{"B"}))); // [-1];
        System.out.println(Arrays.toString(solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"}))); // [4, 6];
    }

    public static int[] solution(String[] keymap, String[] targets) {
        setType(keymap);
        int N = targets.length;
        int[] answer = new int[N];

        for (int n = 0;n < N;n++) {
            if (!isCheckTarget(targets[n])) {
                answer[n] = -1;
                continue;
            }
            answer[n] = getPressMin(targets[n]);
        }

        return answer;
    }

    public static boolean isCheckTarget(String target) {
        for (char data :target.toCharArray())
            if (!alpha[data - 'A'])
                return false;
        return true;
    }

    public static boolean[] alpha;
    public static Map<Character, ArrayList<Integer>>[] arrayListMaps;
    public static void setType(String[] keymap) {
        alpha = new boolean[26];
        for (String key : keymap)
            for (char ch : key.toCharArray())
                alpha[ch - 'A'] = true;

        arrayListMaps = new HashMap[keymap.length];
        for (int i = 0;i < keymap.length;i++) {
            arrayListMaps[i] = new HashMap<>();
            int N = keymap[i].toCharArray().length;
            char[] charList = keymap[i].toCharArray();
            for (int n = 0;n < N;n++) {
                if (arrayListMaps[i].containsKey(charList[n])) arrayListMaps[i].get(charList[n]).add(n + 1);
                else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(n + 1);
                    arrayListMaps[i].put(charList[n], arrayList);
                }
            }
        }
    }

    public static int getPressMin(String findKey) {
        int total_index = 0, N = arrayListMaps.length;
        for (char ch : findKey.toCharArray()) {
            int index = Integer.MAX_VALUE;
            for (int n = 0; n < N; n++) {
                if (arrayListMaps[n].containsKey(ch)) {
                    index = Integer.min(index, arrayListMaps[n].get(ch).get(0));
                }
            }
            total_index += index;
        }
        return total_index;
    }
}
