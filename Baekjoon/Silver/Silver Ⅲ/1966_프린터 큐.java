import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 프린터 큐
 *  - 번호 : 1966
 *  - 링크 : https://www.acmicpc.net/problem/1966
 *  2. 풀이핵심
 *  - 확인하고자 하는 중요도만 확인하기
 * 3. 풀이후기
 *  - 출력 순서를 확인해야하는 Print 출력하기
 */
public class Main {

    public static int T, N, M, PrintCount;
    public static Queue<Print> queue;
    public static int[] check;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 0;t < T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            PrintCount = 0;
            queue = new LinkedList<>();
            check = new int[9];

            st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++) {
                int num = Integer.parseInt(st.nextToken());
                if (M == n) queue.add(new Print(num, true));
                else queue.add(new Print(num, false));
                check[num - 1]++;
            }

            while (!queue.isEmpty()) {
                int findImportance = maxImportance();

                if (findImportance == -1) break;

                Print p = queue.poll();
                if (p.importance == findImportance) {
                    PrintCount++;
                    if (p.check) {
                        sb.append(PrintCount).append("\n");
                        break;
                    }
                    check[findImportance - 1]--;
                } else queue.add(p);
            }
        }

        System.out.println(sb.toString());
    }

    public static int maxImportance() {
        for (int i = 8;i >= 0;i--)
            if (check[i] > 0)
                return i + 1;
        return -1;
    }

    public static class Print {
        public int importance;
        public boolean check;

        public Print(int importance, boolean check) {
            this.importance = importance;
            this.check = check;
        }
    }
}
