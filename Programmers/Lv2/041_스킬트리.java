/**
 * 1. 문제정보
 *  - 제목 : 스킬트리
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/49993
 *  2. 풀이핵심
 *  - 문자열 정리
 * 3. 풀이후기
 *  - 문자열을 대치하여 순서대로 나오지 않는다면 false를 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"})); // 2
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skill_tree : skill_trees)
            if (isCheck(skill, skill_tree))
                answer++;
        return answer;
    }

    public static boolean isCheck(String skill, String skill_tree) {
        for (int i = 0;i < skill.length();i++) {
            char ch = skill.charAt(i);
            if (skill_tree.contains(Character.toString(ch))) {
                skill_tree = skill_tree.replaceAll(Character.toString(ch), Integer.toString(i));
            }
        }

        int doneInteger = -1;
        for (char ch : skill_tree.toCharArray()) {
            if (!('0' <= ch && ch <= '9')) continue;
            if (doneInteger == -1) {
                doneInteger = ch - '0';
                if (doneInteger != 0) return false;
                continue;
            }

            if (doneInteger + 1 == (ch - '0')) doneInteger++;
            else return false;
        }
        return true;
    }
}
