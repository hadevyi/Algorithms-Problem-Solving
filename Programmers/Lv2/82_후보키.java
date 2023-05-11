import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 후보키
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42890
 *  2. 풀이핵심
 *  - setsub을 구하고, 최소성을 유의해 진행해야함
 * 3. 풀이후기
 *  - 최소성에 대해서 다르게 확인해야 한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[][] {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}})); // 2
        System.out.println(solution(new String[][] {{"a", "1", "aaa", "c", "ng"}, {"b", "1", "bbb", "c", "g"}, {"c", "1", "aaa", "d", "ng"}, {"d", "2", "bbb", "d", "ng"}})); // 3
    }

    public static int RELATION, TUPLE;
    public static ArrayList<String> checkList = new ArrayList<>();
    public static ArrayList<String> answerList = new ArrayList<>();
    public static int solution(String[][] relation) {
        TUPLE = relation.length;
        RELATION = relation[0].length;
        setCheckList();

        for (String data : checkList) {
            if (!isOK(data)) continue;

            Set<String> set = new HashSet<>();
            for (String[] rela : relation) {
                StringBuffer sb = new StringBuffer();
                for (char ch : data.toCharArray())
                    sb.append(rela[ch-'0']).append("|");
                set.add(sb.toString());
            }

            if (set.size() == TUPLE) {
                answerList.add(data);
            }
        }

        return answerList.size();
    }

    public static boolean isOK(String value) {
        if (answerList.isEmpty()) return true;
        for (String data : answerList) {
            boolean check = true;
            for (char ch : data.toCharArray()) {
                check = check && value.contains(Character.toString(ch));
            }
            if (check) return false;
        }
        return true;
    }

    public static void setCheckList() {
        for (int size = 1;size <= RELATION;size++) {
            SIZE = size;
            ARR = new int[SIZE];
            combain(0, 0);
        }
    }

    public static int SIZE;
    public static int[] ARR;
    public static void combain(int srcIdx, int tgtIdx) {
        if (tgtIdx == SIZE) {
            StringBuffer sb = new StringBuffer();
            for (int data : ARR)
                sb.append(data);
            checkList.add(sb.toString());
            return;
        }

        for (int i = srcIdx;i < RELATION;i++) {
            ARR[tgtIdx] = i;
            combain(i + 1, tgtIdx + 1);
        }
    }
}
