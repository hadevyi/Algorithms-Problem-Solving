import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 코로나 메뉴얼2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/covid-manual2/description
 * 2. 풀이핵심
 *  - count 배열
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static boolean isEmergency;
    public static int N, C = 4;
    public static int[] COUNT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        COUNT = new int[C];

        for (int n = 0;n < 3;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            boolean isYN = st.nextToken().charAt(0) == 'Y';
            int score = Integer.parseInt(st.nextToken());

            int index = 0;
            if (isYN && score >= 37) index = 0;
            else if (!isYN && score >= 37) index = 1;
            else if (isYN && score < 37) index = 2;
            else index = 3;
            COUNT[index]++;
        }

        isEmergency = COUNT[0] >= 2;
        StringBuffer sb = new StringBuffer();
        for (int c = 0;c < C;c++)
            sb.append(COUNT[c]).append(" ");
        if (isEmergency) sb.append('E');
        System.out.println(sb.toString());
    }
}