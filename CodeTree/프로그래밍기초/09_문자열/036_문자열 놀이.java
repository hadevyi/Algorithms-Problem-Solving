import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 놀이
 *  - 링크 : https://www.codetree.ai/missions/4/problems/play-with-string/description
 * 2. 풀이핵심
 *  - 문자 수정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] chList = st.nextToken().toCharArray();
        int N = Integer.parseInt(st.nextToken());        
        StringBuffer sb = new StringBuffer();


        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            int option = Integer.parseInt(st.nextToken());
            String str1 = st.nextToken(), str2 = st.nextToken();

            if (option == 1) switching(chList, str1, str2);
            else replace(chList, str1, str2);

            for (char ch : chList) sb.append(ch);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    private static void switching(char[] arr, String str1, String str2) {
        int idx1 = Integer.parseInt(str1) - 1, idx2 = Integer.parseInt(str2) - 1;
        char temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static void replace(char[] arr, String str1, String str2) {
        char base = str1.charAt(0), renew = str2.charAt(0);
        for (int idx = 0;idx < arr.length;idx++) {
            if (arr[idx] != base) continue;
            arr[idx] = renew;
        }
    }
}
