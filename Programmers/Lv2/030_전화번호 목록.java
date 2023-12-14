import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 전화번호 목록
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42577
 *  2. 풀이핵심
 *  - 범위가 1,000,000 이기에 직접 비교하면 시간이 오래걸린다.
 * 3. 풀이후기
 *  - 첫 글자를 기준으로 확인해서 Set으로 확인함. 첫 글자는 Map으로 빠른 select를 할 수 있도록 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"119", "97674223", "1195524421"})); // false
        System.out.println(solution(new String[] {"123","456","789"})); // true
        System.out.println(solution(new String[] {"12","123","1235","567","88"})); // false
    }

    public static Map<Character, Set<String>> setMap;
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        // 1 <= phone_book.length <= 1,000,000
        setMap = new HashMap<>();
        for (int i = 0;i < 10;i++) {
            Set set = new HashSet();
            setMap.put((char)('0' + i), set);
        }

        for (String phoneNumber : phone_book) {
            int N = phoneNumber.length();
            Set<String> set = setMap.get(phoneNumber.charAt(0));
            for (int n = 1;n <= N;n++) {
                if (set.contains(phoneNumber.substring(0, n)))
                    return false;
            }
            set.add(phoneNumber);
        }
        return true;
    }
}
