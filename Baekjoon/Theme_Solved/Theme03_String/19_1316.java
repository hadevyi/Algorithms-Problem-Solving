import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1316
 *  - 번호 : 그룹 단어 체커
 *  - 링크 : https://www.acmicpc.net/problem/1316
 *  2. 풀이핵심
 *  - 연속적인 글자 그룹 확인
 * 3. 풀이후기
 *  - ArrayList의 배열을 활용해 순서대로 확인함
 */
public class Main {
    static int T, TOTAL;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for(int t = 0;t < T;t++)
            if (checkGroupWord(br.readLine()))
                TOTAL++;

        System.out.println(TOTAL);
    }

    static int N = 26;

    public static boolean checkGroupWord(String str) {
        ArrayList<Integer>[] arrayLists = new ArrayList[N];
        for (int n = 0;n < N;n++)
            arrayLists[n] = new ArrayList<>();

        // 순서대로 각 알파벳의 인덱스를 순서대로 저장
        int len = str.length();
        for (int i = 0;i < len;i++)
            arrayLists[str.charAt(i) - 'a'].add(i);

        // 확인하면서 순서대로가 아니면, false를 바로 return
        for (int n = 0;n < N;n++) {
            int LEN = arrayLists[n].size();
            if (LEN == 0 || LEN == 1) continue;
            if (!consecutiveChar(arrayLists[n])) return false;
        }

        return true;
    }

    public static boolean consecutiveChar(ArrayList<Integer> arrayList) {
        int len = arrayList.size();
        Collections.sort(arrayList);

        for (int i = 1;i < len;i++)
            if (arrayList.get(i) - arrayList.get(i - 1) > 1) return false;
        return true;
    }
}
