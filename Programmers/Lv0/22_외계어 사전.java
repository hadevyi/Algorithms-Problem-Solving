/**
 * 1. 문제정보
 *  - 제목 : 외계어 사전
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120869
 *  2. 풀이핵심
 *  - 오직 한 번만 사용해야하며, 모두 사용해야 함
 * 3. 풀이후기
 *  - 각 조건을 꼼꼼히 구현하면 크게 무리가 없었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"})); // 2
        System.out.println(solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"})); // 1
        System.out.println(solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"})); // 2
    }

    public static int solution(String[] spell, String[] dic) {
        int dicN = dic.length;

        for (int dicn = 0;dicn < dicN;dicn++) {
            String nowCheckStr = dic[dicn];
            if (checkStrSpell(nowCheckStr, spell)) return 1;
        }

        return 2; // 존재하지 않을 때 반환
    }

    public static boolean checkStrSpell(String str, String[] spell) {
        for (int i = 0;i < spell.length;i++) {
            if (str.length() == 0 || !str.contains(spell[i])) return false;
            if (countOneString(str, spell[i]) == 1)
                str = str.replace(spell[i], "");
        }
        return str.length() == 0;
    }

    public static int countOneString(String searchString, String baseString) {
        int count = 0;
        for (int i = 0;i < searchString.length();i++)
            if (Character.toString(searchString.charAt(i)).equals(baseString))
                count++;
        return count;
    }
}
