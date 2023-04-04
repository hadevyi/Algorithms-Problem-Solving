import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 돌아가는 팔각 의자
 *  - 출처 : 삼성SW역량테스트 2017 하반기 오후 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/rounding-eight-angle/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 각 부분부분을 분리해서 진행하였다.
 * 3. 풀이후기
 *  - 시계 방향, 반 시계 방향을 하는 거 자체는 deque가 편하나 중간 index의 값을 확인해야해서 arraylist를 선택했다.
 */
public class Main {

    public static int N = 4, K; // K : 회전 횟수
    public static int[] DIR;
    public static boolean[] isTurn;
    public static ArrayList<Integer>[] arrayLists;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arrayLists = new ArrayList[N];

        for (int n = 0;n < N;n++) {
            String string = br.readLine();
            arrayLists[n] = new ArrayList<>();
            for (int m = 0;m < N * 2;m++)
                arrayLists[n].add(string.charAt(m) - '0');
        }

        K = Integer.parseInt(br.readLine());

        for (int k = 0;k < K;k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()) - 1; // 번호 (0으로 조절)
            int d = Integer.parseInt(st.nextToken()); // 방향 (1 시계방향, -1 반시계방향)
            setDIR(n, d);
            setTurn(n);

            for (int turn = 0;turn < N;turn++) {
                if (!isTurn[turn]) continue;
                if (DIR[turn] == 1)
                    changeCircle(turn);
                else if (DIR[turn] == -1)
                    changeCircleBack(turn);
            }
        }

        System.out.println(getResult());
    }

    public static void changeCircle(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arrayLists[n].get(7));
        for (int i = 0;i < 7;i++)
            temp.add(arrayLists[n].get(i));
        arrayLists[n] = temp;
    }

    public static void changeCircleBack(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1;i < 8;i++)
            temp.add(arrayLists[n].get(i));
        temp.add(arrayLists[n].get(0));
        arrayLists[n] = temp;
    }

    public static void setDIR(int idx, int d) {
        DIR = new int[N];

        for (int n = 0;n < N;n++) {
            if ((idx % 2 == 0) == (n % 2 == 0)) DIR[n] = d;
            else DIR[n] = -1 * d;
        }
    }

    public static void setTurn(int idx) {
        isTurn = new boolean[N];
        isTurn[idx] = true;
        // 앞으로 확인
        for (int i = idx;i > 0;i--) {
            isTurn[i - 1] = arrayLists[i].get(6) != arrayLists[i - 1].get(2);
            if (!isTurn[i - 1]) break;
        }
        // 뒤로 확인
        for (int i = idx;i < N - 1;i++) {
            isTurn[i + 1] = arrayLists[i].get(2) != arrayLists[i + 1].get(6);
            if (!isTurn[i + 1]) break;
        }
    }

    public static int getResult() {
        int result = 0;
        for (int n = 0;n < N;n++)
            result += (int) (Math.pow(2, n)) * (arrayLists[n].get(0) == 1 ? 1 : 0);
        return result;
    }
}
