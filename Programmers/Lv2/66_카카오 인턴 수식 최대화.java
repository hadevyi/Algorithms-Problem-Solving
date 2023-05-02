import java.util.*;

class Solution {
    public long solution(String expression) {
        StringBuffer sb = new StringBuffer();
        Deque<String> dq = new LinkedList<>();
        
        for (char ch : expression.toCharArray()) {
            if ('0' <= ch && ch <= '9') sb.append(ch);
            else {
                sq.add(sb.toString());
                sq.add(ch);
                dq = new LinkedList<>();
            }
        }
        
        long answer = 0;
        return answer;
    }
}