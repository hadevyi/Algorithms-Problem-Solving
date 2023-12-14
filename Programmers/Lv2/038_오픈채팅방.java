import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 오픈채팅방
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42888
 *  2. 풀이핵심
 *  - 출력이 필요로 하는 위치와, 결과 구별하기
 * 3. 풀이후기
 *  - 로직 자체는 쉬웠는데, 어떻게 하면 중복을 최소화할지 고민했다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
        // ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
    }
    public static String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>(); // 접속 이력이 있는지 확인
        ArrayList<String> printMessages = new ArrayList<>(); // 출력하기

        for (String eachRecord : record) {
            StringTokenizer st = new StringTokenizer(eachRecord);
            String type = st.nextToken();
            String userId = st.nextToken();
            String userNickName = "";
            if (!type.equals("Leave"))
                userNickName = st.nextToken();

            if (type.equals("Enter")) {
                // 입장
                userMap.put(userId, userNickName);
                printMessages.add(userId + " Enter");
            } else if (type.equals("Leave")) {
                // 퇴장
                printMessages.add(userId+" Leave");
            } else {
                // 닉네임 변경
                userMap.put(userId, userNickName);
            }
        }

        int idx = 0;
        String[] answer = new String[printMessages.size()];
        for (String printMeesage : printMessages) {
            StringTokenizer st = new StringTokenizer(printMeesage);
            StringBuffer sb = new StringBuffer();
            sb.append(userMap.get(st.nextToken()));
            sb.append(st.nextToken().equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.");
            answer[idx++] = sb.toString();
        }
        return answer;
    }
}
