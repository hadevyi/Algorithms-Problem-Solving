import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [3차] 파일명 정렬
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17686
 *  2. 풀이핵심
 *  - 문자열 처리와 priorityQueue 활용
 * 3. 풀이후기
 *  - tail이 없는 경우를 잘 구별해서 진행해야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
        // ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]
        System.out.println(Arrays.toString(solution(new String[] {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})));
        // ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
    }

    public static String[] solution(String[] files) {
        PriorityQueue<File> pq = new PriorityQueue<>();
        for (String file : files) {
            int numberStartIdx = -1, numberEndIdx = -1;
            for (int idx = 0;idx < file.length();idx++) {
                char ch = file.charAt(idx);
                if ('0' <= ch && ch <=  '9' && numberStartIdx == -1) {
                    numberStartIdx = idx;
                } else if (!('0' <= ch && ch <=  '9' ) && numberStartIdx != -1 && numberEndIdx == -1) {
                    numberEndIdx = idx;
                    break;
                }
            }

            String head = file.substring(0, numberStartIdx);
            String number = "";
            String tail = "";

            if (numberEndIdx != -1) {
                number = file.substring(numberStartIdx, numberEndIdx);
                tail = file.substring(numberEndIdx);
            } else {
                number = file.substring(numberStartIdx);
            }

            pq.offer(new File(file, head.toLowerCase(), Integer.parseInt(number), tail, pq.size()));
        }

        int idx = 0;
        String[] answer = new String[files.length];
        while (!pq.isEmpty()) {
            answer[idx++] = pq.poll().fileName;
        }
        return answer;
    }

    public static class File implements Comparable<File> {
        String fileName;
        String head;
        int number;
        String tail;
        int order;

        public File(String fileName, String head, int number, String tail, int order) {
            this.fileName = fileName;
            this.head = head;
            this.number = number;
            this.tail = tail;
            this.order = order;
        }

        @Override
        public int compareTo(File o) {
            if (this.head.equals(o.head)) {
                if (this.number == o.number)
                    return this.order - o.order;
                return this.number - o.number;
            }
            return this.head.compareTo(o.head);
        }
    }
}
