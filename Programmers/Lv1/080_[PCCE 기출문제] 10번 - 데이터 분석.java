import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 10번 / 데이터 분석
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250121
 * 2. 풀이핵심
 * - 조건에 알맞는 값 분류
 * 3. 풀이후기
 * - 값을 꺼내는 기준과 정렬하는 기준이 다른 부분에 오류를 냈다...
 */
class Solution {
    public Map<String, Integer> map = new HashMap<>(){{
       put("code", 0); put("date", 1); put("maximum", 2); put("remain", 3);
    }};
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = getList(data, ext, val_ext);        
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[map.get(sort_by)] - o2[map.get(sort_by)];
            }
        });
        
        int[][] answer = new int[list.size()][4];
        for (int i = 0;i < list.size();i++) {
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
            answer[i][2] = list.get(i)[2];
            answer[i][3] = list.get(i)[3];
        }
        return answer;
    }
    
    public List<int[]> getList(int[][] data, String ext, int val_ext) {
        List<int[]> result = new ArrayList<>();
        
        for (int[] d : data) {
            if (d[map.get(ext)] < val_ext) {
                result.add(d);
            }
        }
        
        return result;
    }
}