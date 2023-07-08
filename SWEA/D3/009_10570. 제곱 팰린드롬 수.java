import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10570. 제곱 팰린드롬 수
 *  2. 풀이핵심
 *  - 정수의 값인지 확인하는 로직
 * 3. 풀이후기
 *  - 간단하면서도, 항상 나올때마다 한번에 하는 법이 없다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int num = n;num <= m;num++) {
                if (Math.sqrt(num) != (int) Math.sqrt(num)) continue;
                if (!isCheck((int) Math.sqrt(num))) continue;
                if (!isCheck(num)) continue;
                count++;
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean isCheck(int num) {
        char[] chList = Integer.toString(num).toCharArray();
        int N = chList.length;

        for (int n = 0;n < N / 2;n++) {
            if (chList[n] != chList[N - 1 - n])
                return false;
        }

        return true;
    }
}
