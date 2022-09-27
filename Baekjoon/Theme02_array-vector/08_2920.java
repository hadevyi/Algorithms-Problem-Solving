import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 음계
 *  - 번호 : 2920
 *  - 링크 : https://www.acmicpc.net/problem/2920
 *  2. 풀이핵심
 *  - 순서대로 위치에 나왔는지 확인
 * 3. 풀이후기
 *  - 2가지 경우에 따라 나오는 경우를 삼항연산자를 활용해 배치
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Data = br.readLine().split(" ");

        if (equals(Data, "ASCE")) System.out.println("ascending");
        else if (equals(Data, "DESC")) System.out.println("descending");
        else System.out.println("mixed");
    }

    public static boolean equals(String[] array, String Type) {
        int min = Type.equals("ASCE") ? 1 : 8;

        for (int i = 0;i < 8;i++) {
            if (min != Integer.parseInt(array[i])) return false;
            min += Type.equals("ASCE") ? 1 : -1;
        }

        return true;
    }
}