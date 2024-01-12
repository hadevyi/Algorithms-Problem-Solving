import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 청소당번 정하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/cleaning-numbering/description
 * 2. 풀이핵심
 *  - 조건 카운팅
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int DAY = Integer.parseInt(br.readLine());

        int classroom = 0, hallway = 0, washroom = 0;
        for (int day = 1;day <= DAY;day++) {
            if (day % 12 == 0) washroom++;
            else if (day % 3 == 0) hallway++;
            else if (day % 2 == 0) classroom++;
        }

        System.out.println(classroom + " " + hallway + " " + washroom);
    }
}