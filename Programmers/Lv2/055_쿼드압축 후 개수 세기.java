import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 쿼드압축 후 개수 세기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68936
 *  2. 풀이핵심
 *  - 엣지케이스들을 확인하기 (처음부터 모두 다 차있는 경우, arr.length가 1 혹은 2인 경우)
 * 3. 풀이후기
 *  - 정사각형과 길이가 2^n이라는 보장이 있었기에 나눴음 
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[][] {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}}))); // [4, 9]
        System.out.println(Arrays.toString(solution(new int[][]
                {
                        {1,1,1,1,1,1,1,1},
                        {0,1,1,1,1,1,1,1},
                        {0,0,0,0,1,1,1,1},
                        {0,1,0,0,1,1,1,1},
                        {0,0,0,0,0,0,1,1},
                        {0,0,0,0,0,0,0,1},
                        {0,0,0,0,1,0,0,1},
                        {0,0,0,0,1,1,1,1}
                }))
        ); // [10, 15]
    }
    public static int[][] ARR;
    public static ArrayList<String> arrayList;
    public static int[] solution(int[][] arr) {
        arrayList = new ArrayList<>();
        ARR = new int[arr.length][arr[0].length];
        for (int i = 0;i < arr.length;i++)
            ARR[i] = arr[i].clone();

        if (isFull())
            return arr[0][0] == 0 ? new int[] {1, 0} : new int[] {0, 1};

        if (arr.length == 1) {
            arrayList.add(Integer.toString(arr[0][0]));
        } else if (arr.length == 2) {
            checkEachArray(0, arr.length, 0, arr.length);
        } else
            checkArray(0, arr.length, 0, arr.length);

        int zeroCount = 0, oneCount = 0;
        for (String str : arrayList)
            for (char ch : str.toCharArray())
                if (ch - '0' == 0) zeroCount++;
                else oneCount++;
        return new int[] {zeroCount, oneCount};
    }

    public static boolean isFull() {
        boolean allZero = true, allOne = true;

        for (int[] arr : ARR)
            for (int data : arr) {
                if (allZero && data == 1) allZero = false;
                if (allOne && data == 0) allOne = false;
            }

        return allZero || allOne;
    }

    public static void checkArray(int startI, int endI, int startJ, int endJ) {
        // 4개 분면 확인하기
        checkEachArray(startI, (startI + endI) / 2, startJ, (startJ + endJ) / 2); // 1사분면
        checkEachArray(startI, (startI + endI) / 2, (startJ + endJ) / 2, endJ); // 2사분면
        checkEachArray((startI + endI) / 2, endI, startJ, (startJ + endJ) / 2); // 3사분면
        checkEachArray((startI + endI) / 2, endI, (startJ + endJ) / 2, endJ); // 4사분면
    }

    public static void checkEachArray(int startI, int endI, int startJ, int endJ) {
        StringBuffer sb = new StringBuffer();
        boolean allZero = true, allOne = true;

        for (int i = startI;i < endI;i++) {
            for (int j = startJ;j < endJ;j++) {
                if (allZero && ARR[i][j] == 1) allZero = false;
                if (allOne && ARR[i][j] == 0) allOne = false;
                sb.append(ARR[i][j]);
            }
        }

        if (allZero) {
            arrayList.add("0");
        } else if (allOne) {
            arrayList.add("1");
        } else if ((endI - startI) == 2 || (endJ - startJ) == 2) {
            arrayList.add(sb.toString());
        } else {
            checkArray(startI, endI, startJ, endJ);
        }
    }
}
