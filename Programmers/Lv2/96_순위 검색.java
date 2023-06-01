import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 순위 검색
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/72412
 *  2. 풀이핵심
 *  - 값이 크지만, 기준이 적을 때 직접 만들어줄 수 있다. 이분탐색을 써야한다.
 * 3. 풀이후기
 *  - 이분탐색을 다시 복습해야한다... 무조건 ㅜㅜ
 */
class Solution { 
    public Map<String, ArrayList<Integer>> map = new HashMap<>();;
    public int[] solution(String[] info, String[] query) {
        int N = query.length;
        int[] answer = new int[N];
        
        // map setting
        for (String eachInfo : info) {
            StringTokenizer st = new StringTokenizer(eachInfo);
            String[] data = {st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken()};
            int score = Integer.parseInt(st.nextToken());
            
            for (String type : getAllType(data)) {
                if (map.containsKey(type)) {
                    map.get(type).add(score);
                } else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(score);
                    map.put(type, arrayList);
                }
            }
        }
        
        for (String key : map.keySet())
            Collections.sort(map.get(key));
        
        // query check
        int idx = 0;
        for (String eachQuery : query) {
            StringTokenizer st = new StringTokenizer(eachQuery);
            StringBuffer sb = new StringBuffer();
            int SIZE = st.countTokens();
            
            for (int size = 0;size < SIZE - 1;size++) {
                String token = st.nextToken();
                if (token.equals("and")) continue;
                sb.append(token);
            }
            
            String findData = sb.toString();
            if (map.containsKey(findData)) {
                int moreScore = Integer.parseInt(st.nextToken());

                ArrayList<Integer> arrayList = map.get(findData);
                int start = 0, end = arrayList.size() - 1;

                while (start <= end) {
                    int mid = (start + end) / 2;

                    if (arrayList.get(mid) < moreScore) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                
                answer[idx++] = arrayList.size() - start;
            } else idx++;
        }
        
        return answer;
    }
    
    public String[] getAllType(String[] data) {
        String[] list = {"0000", "0001", "0010", "0011",
                        "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011",
                        "1100", "1101", "1110", "1111"};
        
        String[] result = new String[list.length];
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        
        for (String li : list) {
            sb = new StringBuffer();
            for (int i = 0;i < 4;i++) {
                char ch = li.charAt(i);
                sb.append(ch == '0' ? '-' : data[i]);
            }
            result[idx++] = sb.toString();
        }
        
        return result;
    }
}   