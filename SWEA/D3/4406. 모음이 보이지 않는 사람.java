import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4406. 모음이 보이지 않는 사람
 *  2. 풀이핵심
 *  - 단순 if문
 * 3. 풀이후기
 *  - 확인하기 쉬운 문제
 */
public class Solution {

    public static int T;
    public static char[] list = {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            char[] chList = br.readLine().toCharArray();
            int N = chList.length;
            StringBuffer temp = new StringBuffer();

            for (int n = 0;n < N;n++) {
                boolean isCheck = true;

                for (int idx = 0;idx < list.length;idx++) {
                    if (chList[n] == list[idx]) {
                        isCheck = false;
                        break;
                    }
                }

                if (isCheck) {
                    temp.append(chList[n]);
                }
            }

            sb.append(temp.toString());
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
