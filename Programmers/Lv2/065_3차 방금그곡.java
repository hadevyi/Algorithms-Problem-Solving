import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [3차] 방금그곡
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17683
 *  2. 풀이핵심
 *  - 검은 건반을 눌리는 구간을 대치해서 진행했음
 * 3. 풀이후기
 *  - 문자열 구별에 시간이 걸리지 어려운 문제는 아니였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})); // HELLO
        System.out.println(solution("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})); // FOO
        System.out.println(solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})); // WORLD
    }

    public static String solution(String m, String[] musicinfos) {
        PriorityQueue<Music> pq = new PriorityQueue<>();
        int idx = 0;
        m = newString(m);

        for (String musicinfo : musicinfos) {
            StringTokenizer st = new StringTokenizer(musicinfo, ",");
            String startTime = st.nextToken();
            String endTime = st.nextToken();
            String title = st.nextToken();
            String code = st.nextToken();
            code = newString(code);

            Music music = new Music(idx++, startTime, endTime, title, code);
            if (music.codes.contains(m))
                pq.offer(music);
        }

        return pq.isEmpty() ? "(None)" : pq.poll().title;
    }

    static Map<String, String> map = new HashMap<>() {{
        put("C#", "H"); put("D#", "I"); put("F#", "J");
        put("G#", "K"); put("A#", "L");
    }};
    public static String newString(String str) {
        for (String key : map.keySet())
            str = str.replace(key, map.get(key));
        return str;
    }

    public static class Music implements Comparable<Music> {
        int index;
        int totalTime;
        String title;
        String codes;

        public Music(int index, String startTime, String endTime, String title, String code) {
            this.index = index;
            this.title = title;

            StringTokenizer st = new StringTokenizer(startTime, ":");
            int time1 = Integer.parseInt(st.nextToken()) * 60;
            time1 += Integer.parseInt(st.nextToken());

            st = new StringTokenizer(endTime, ":");
            int time2 = Integer.parseInt(st.nextToken()) * 60;
            time2 += Integer.parseInt(st.nextToken());
            this.totalTime = time2 - time1;

            int idx = 0;
            StringBuffer sb = new StringBuffer();
            for (int n = 0;n < this.totalTime;n++) {
                sb.append(code.charAt(idx));
                idx = idx + 1 < code.length() ? idx + 1 : 0;
            }
            this.codes = sb.toString();
        }

        @Override
        public int compareTo(Music o) {
            if (this.totalTime == o.totalTime)
                return this.index - o.index;
            return o.totalTime - this.totalTime;
        }
    }
}
