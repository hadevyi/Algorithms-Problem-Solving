import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 신고 결과 받기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/92334
 *  2. 풀이핵심
 *  - User가 신고를 받은 내용과 신고를 한 내용을 정하면 됨
 * 3. 풀이후기
 *  - 단, 동일한 사람이 같은 사람을 계속 신고하면 1개로 인정하기에 중복을 제외하도록 해야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2))); // [2,1,1,0]
        System.out.println(Arrays.toString(solution(new String[] {"con", "ryan"}, new String[] {"ryan con", "ryan con", "ryan con", "ryan con"}, 2))); // [0,0]
    }

    public static Map<String, ArrayList<String>> reportMaps, beReportMaps; // 유저가 신고한 사람, 유저를 신고한 사람
    public static int[] solution(String[] id_list, String[] report, int k) {
        reportMaps = new HashMap<>();
        beReportMaps = new HashMap<>();

        for (String id : id_list) {
            reportMaps.put(id, new ArrayList<>());
            beReportMaps.put(id, new ArrayList<>());
        }

        for (String report_each : report) {
            StringTokenizer st = new StringTokenizer(report_each);
            String reportUser = st.nextToken();
            String beReportUser = st.nextToken();

            if (!reportMaps.get(reportUser).contains(beReportUser)) reportMaps.get(reportUser).add(beReportUser);
            if (!beReportMaps.get(beReportUser).contains(reportUser)) beReportMaps.get(beReportUser).add(reportUser);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0;i < id_list.length;i++) {
            int result = 0;

            for (String beReport : reportMaps.get(id_list[i])) {
                if (beReportMaps.get(beReport).size() < k) continue;
                result++;
            }

            answer[i] = result;
        }
        return answer;
    }
}
