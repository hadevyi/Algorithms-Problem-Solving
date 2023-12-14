import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [1차] 뉴스 클러스터링
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17677
 *  2. 풀이핵심
 *  - 교집합/합집합 처리 과정
 * 3. 풀이후기
 *  - 필요한 단계를 확인하며 Method로 분리해서 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("FRANCE", "french")); // 16384
        System.out.println(solution("handshake", "shake hands")); // 65536
        System.out.println(solution("aa1+aa2", "AAAA12")); // 43690
        System.out.println(solution("E=M*C^2", "e=m*c^2")); // 65536
    }

    public static int solution(String str1, String str2) {
        str1 = checkCharDetail(str1);
        str2 = checkCharDetail(str2);

        if (str1.equals(str2)) return 65536;

        Map<String, Integer> map1 = getData(str1);
        Map<String, Integer> map2 = getData(str2);

        ArrayList<String> N = new ArrayList<>(), U = new ArrayList<>();
        for (String str : map1.keySet()) {
            if (map2.containsKey(str)) {
                // map1에도 있고, map2에도 있는 경우
                int countN = Math.min(map1.get(str), map2.get(str));
                int countU = Math.max(map1.get(str), map2.get(str));

                for (int c = 0;c < countU;c++) U.add(str);
                for (int c = 0;c < countN;c++) N.add(str);
            } else {
                for (int c = 0;c < map1.get(str);c++) U.add(str);
            }
        }

        for (String str : map2.keySet())
            if (!map1.containsKey(str))
                for (int c = 0;c < map2.get(str);c++)
                    U.add(str);

        double result = (double)N.size() / (double)U.size();
        return (int)(result * 65536);
    }

    public static Map<String, Integer> getData(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0;i < str.length() - 1;i++) {
            String strDeatil = str.substring(i, i + 2);
            if (!isCheck(strDeatil)) continue;
            if (map.containsKey(strDeatil)) map.put(strDeatil, map.get(strDeatil) + 1);
            else map.put(strDeatil, 1);
        }

        return map;
    }

    public static boolean isCheck(String str) {
        for (char ch : str.toCharArray())
            if (!('a' <= ch && ch <= 'z'))
                return false;
        return true;
    }

    public static String checkCharDetail(String str) {
        StringBuffer sb = new StringBuffer();
        for (char ch : str.toCharArray())
            if ('A' <= ch && ch <= 'Z')
                sb.append((char)(ch + (('a' - 'A'))));
            else
                sb.append(ch);
        return sb.toString();
    }
}
