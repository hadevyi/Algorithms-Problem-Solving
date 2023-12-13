/**
 * 1. 문제정보
 *  - 제목 : 로그인 성공?
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
 *  2. 풀이핵심
 *  - db로 정해진 array를 기준으로 user의 내용을 확인함
 * 3. 풀이후기
 *  - String의 동일 확인을 위해 equals를 활용하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"meosseugi", "1234"},new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[] {"programmer01", "15789"},	new String[][] {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[] {"rabbit04", "98761"}, new String[][] {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }

    public static String solution(String[] id_pw, String[][] db) {
        StringBuffer sb = new StringBuffer();

        String id = id_pw[0];
        String pw = id_pw[1];

        int N = db.length;
        for (int n = 0;n < N;n++) {
            String dbId = db[n][0];
            String dbPw = db[n][1];

            if (id.equals(dbId) && pw.equals(dbPw))
                return "login";
            else if (id.equals(dbId) && !pw.equals(dbPw))
                return "wrong pw";
        }

        return "fail";
    }
}
