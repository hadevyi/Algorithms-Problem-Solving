import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 과제 진행하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/176962#
 *  2. 풀이핵심
 *  - 정렬과 계산
 * 3. 풀이후기
 *  - 코드가 길어졌지만, 값을 잘 계산하면 충분히 괜찮을 것같다.
 */
class Solution {
    public String[] solution(String[][] plans) {
        int N = plans.length;
        String[] answer = new String[N];
        
        PriorityQueue<Study> pq = new PriorityQueue<>();
        for (String[] plan : plans)
            pq.offer(new Study(plan[0], plan[1], plan[2]));
        
        Study now = pq.poll();
        int SIZE = pq.size(), idx = 0;
        Stack<Study> stack = new Stack<>();
        
        for (int size = 0;size < SIZE;size++) {
            Study next = pq.poll();
            int gap = next.startTime - now.startTime;
            
            if (gap < now.remainTime) {
                now.remainTime -= gap;
                stack.push(now);
            } else if (gap == now.remainTime) {
                now.remainTime = 0;
                answer[idx++] = now.name;
            } else {
                gap -= now.remainTime;
                now.remainTime = 0;
                answer[idx++] = now.name;
                
                while (!stack.isEmpty() && gap > 0) {
                    if (gap < stack.peek().remainTime) {
                        stack.peek().remainTime -= gap;
                        gap = 0;
                    } else if (gap == stack.peek().remainTime) {
                        gap = 0;
                        stack.peek().remainTime = 0;
                        answer[idx++] = stack.peek().name;
                        stack.pop();
                    } else {
                        gap -= stack.peek().remainTime;
                        stack.peek().remainTime = 0;
                        answer[idx++] = stack.peek().name;
                        stack.pop();
                    }
                }
            }
            now = next;
        }
        
        answer[idx++] = now.name;
        while (!stack.isEmpty())
            answer[idx++] = stack.pop().name;
        
        return answer;
    }
    
    public class Study implements Comparable<Study> {
        String name;
        int startTime;
        int remainTime;
        
        public Study(String name, String startTime, String remainTime) {
            this.name = name;
            
            int time = 0;
            StringTokenizer st = new StringTokenizer(startTime, ":");
            time += Integer.parseInt(st.nextToken()) * 60;
            time += Integer.parseInt(st.nextToken());
            this.startTime = time;
            
            this.remainTime = Integer.parseInt(remainTime);
        }
        
        @Override
        public int compareTo(Study o) {
            return this.startTime - o.startTime;
        }
    }
}