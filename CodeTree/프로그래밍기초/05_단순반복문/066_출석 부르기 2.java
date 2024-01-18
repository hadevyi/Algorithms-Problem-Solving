import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출석 부르기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/calling-attendance-2/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static Map<Integer, String> map = new HashMap<Integer, String>(){{
        put(1, "John"); put(2, "Tom"); put(3, "Paul"); put(4, "Sam");
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (!map.containsKey(num)) {
                sb.append("Vacancy");
                break;
            }
            sb.append(map.get(num)).append("\n");
        }

        System.out.println(sb.toString());
    }
}