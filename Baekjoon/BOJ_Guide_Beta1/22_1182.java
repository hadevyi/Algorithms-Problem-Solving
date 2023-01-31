import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 부분수열의 합
 *  - 번호 : 1182
 *  - 링크 : https://www.acmicpc.net/problem/1182
 *  2. 풀이핵심
 *  - 부분수열을 구하는 방법과 부분수열의 크기가 양수인 조건 확인
 * 3. 풀이후기
 *  - 크기가 양수인 조건을 구현하기 위해 다양하게 고려했지만, true일 때의 경우를 세는 것이 가장 간단했다.
 */
public class Main {

    public static int N, S, COUNT;
    public static int[] Set;
    public static boolean[] isSelected;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        Set = new int[N];
        isSelected = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            Set[n] = Integer.parseInt(st.nextToken());

        getSubSet(0);
        System.out.println(COUNT);
    }

    public static void getSubSet(int srcIdx) {
        if (srcIdx == N) {
            checkCollectS();
            return;
        }

        isSelected[srcIdx] = true;
        getSubSet(srcIdx + 1);
        isSelected[srcIdx] = false;
        getSubSet(srcIdx + 1);
    }

    public static void checkCollectS() {
        int result = 0, count = 0;
        for (int n = 0;n < N;n++)
            if (isSelected[n]) {
                result += Set[n];
                count++;
            }

        if (result == S && count > 0) COUNT++;
    }
}
