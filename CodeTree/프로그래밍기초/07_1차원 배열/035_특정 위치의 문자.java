import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 위치의 문자
 *  - 링크 : https://www.codetree.ai/missions/4/problems/char-in-specific-location/description
 * 2. 풀이핵심
 *  - 탐색
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 6;
    public static char[] ARR = {'L', 'E', 'B', 'R', 'O', 'S'};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);
        int index = indexOf(ch);
        System.out.println(index == -1 ? "None" : index);
    }

    public static int indexOf(char ch) {
        for (int n = 0;n < N;n++)
            if (ARR[n] == ch)
                return n;
        return -1;
    }
}