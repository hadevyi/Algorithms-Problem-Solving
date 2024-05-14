import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 중복되지 않는 숫자 중 최대
 *  - 링크 : https://www.codetree.ai/missions/4/problems/max-of-unique-number/description
 *  2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        Set<Integer> uniqe = new HashSet<>();
        Set<Integer> notUniqe = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());

            if (notUniqe.contains(num)) continue;

            if (uniqe.contains(num)) {
                notUniqe.add(num);
                uniqe.remove(num);
            } else uniqe.add(num);
        }

        int max = -1;
        for (int num : uniqe) max = Math.max(max, num);
        System.out.println(max);
    }
}