import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단체사진 찍기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1835
 *  2. 풀이핵심
 *  - 주어진 조건대로 그대로 구현
 * 3. 풀이후기
 *  - 시간이 좀 걸렸지만, class와 method로 해서 조금 더 편했다.
 */
class Solution {
    public int ANSWER;
    public int solution(int n, String[] data) {
        ANSWER = 0;
        ARR = new String[8];
        isVisited = new boolean[8];
        
        conditionList = new ArrayList<>();
        for (String d : data)
            conditionList.add(new Condition(d));
        
        setList(0);
        return ANSWER;
    }
    
    public List<Condition> conditionList;
    public boolean isCorrect(String str) {
        for (Condition condition : conditionList) {
            char[] findPerson = condition.getPerson();
            if (!condition.checkDir(new int[] { str.indexOf(findPerson[0]), str.indexOf(findPerson[1]) }))
                return false;
        }
        return true;
    }
    
    public class Condition {
        int dir;
        char person1, person2, op;
        
        public Condition(String data) {
            person1 = data.charAt(0);
            person2 = data.charAt(2);
            op = data.charAt(3);
            dir = data.charAt(4) - '0';
        }
        
        public char[] getPerson() {
            return new char[] { person1, person2 };
        }
        
        public boolean checkDir(int[] person) {
            Arrays.sort(person);
            if (op == '<') {
                return person[1] - person[0] - 1 < dir;
            } else if (op == '=') {
                return person[1] - person[0] - 1 == dir;
            } else {
                return person[1] - person[0] - 1 > dir;
            }
        }
    }
    
    public String[] ARR;
    public boolean[] isVisited;
    public String[] Kakao = {"A", "C", "F", "J", "M", "N", "R", "T"};
    public void setList(int tgtIdx) {
        if (tgtIdx == ARR.length) {
            StringBuffer sb = new StringBuffer();
            for (String arr : ARR) sb.append(arr);
            if (isCorrect(sb.toString())) ANSWER++;
            return;
        }
        
        for (int i = 0;i < 8;i++) {
            if (isVisited[i]) continue;
            ARR[tgtIdx] = Kakao[i];
            isVisited[i] = true;
            setList(tgtIdx + 1);
            isVisited[i] = false;
        }
    }
}