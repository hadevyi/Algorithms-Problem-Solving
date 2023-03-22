import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 조삼모사
 *  - 출처 : 삼성SW역량테스트 2017 하반기 오전 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/three-at-dawn-and-four-at-dusk/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 어떻게 절반을 선택하는지, 또 각 선택결과의 합산을 어떻게 얻는지가 중요했음
 * 3. 풀이후기
 *  - 처음엔 경우의 수의 중복을 막고자 하였으나 시간이 더 오래걸려, 각 단계를 모두 수행하였음
 */
public class Main {

    public static int N, MIN; // 2의 배수
    public static int[][] maps; // 데이터 정보
    public static boolean[] isSelected;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MIN = Integer.MAX_VALUE;
        N = Integer.parseInt(br.readLine());
        maps = new int[N][N];
        isSelected = new boolean[N];

        StringTokenizer st;
        for (int n = 0;n < N;n++) {
             st = new StringTokenizer(br.readLine());
             for (int m = 0;m < N;m++) {
                 maps[n][m] = Integer.parseInt(st.nextToken());
             }
        }

        // 반으로 나누기
        getHalf(0, 0);

        System.out.println(MIN);
    }

    public static void getMinResult() {
//        System.out.println(Arrays.toString(isSelected));
        int[] trueArray = new int[N/2];
        int[] falseArray = new int[N/2];
        int trueIdx = 0, falseIdx = 0;

        for (int n = 0;n < N;n++)
            if (isSelected[n]) trueArray[trueIdx++] = n;
            else falseArray[falseIdx++] = n;

        int trueTotal = 0, falseTotal = 0;
        for (int n = 0;n < N/2;n++)
            for (int m = n;m < N/2;m++) {
                if (n == m) continue;
                trueTotal += maps[trueArray[n]][trueArray[m]] + maps[trueArray[m]][trueArray[n]];
                falseTotal += maps[falseArray[n]][falseArray[m]] + maps[falseArray[m]][falseArray[n]];
            }

        MIN = Math.min(MIN, trueTotal > falseTotal ?
                trueTotal - falseTotal :
                falseTotal - trueTotal);
//        System.out.println(Arrays.toString(trueArray) + " " + trueTotal + "\t" + Arrays.toString(falseArray) + " " + falseTotal);
    }

    public static void getHalf(int index, int count) {
        if (count == N/2) {
            getMinResult();
            return;
        }
        if (index == N) return;

        isSelected[index] = true;
        getHalf(index + 1, count + 1);
        isSelected[index] = false;
        getHalf(index + 1, count);

    }
}