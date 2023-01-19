import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 개수 세기
 *  - 번호 : 10807
 *  - 링크 : https://www.acmicpc.net/problem/10807
 *  2. 풀이핵심
 *  - 글자 범위가 정해진 내용에서 세기
 * 3. 풀이후기
 *  - 정수 v의 범위는 -100보다 크고 같으며, 100보다 작거나 같음.
 *  - 따라서 해당 범위에 100을 합해 0~200의 index 값을 갖는 201 사이즈의 행렬에 입력과 동시에 증가해, index로 찾음.
 */
public class Main {
    static int N;
    static int[] array;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[201];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) array[Integer.parseInt(st.nextToken())+100]++;

        System.out.println(array[Integer.parseInt(br.readLine())+100]);
    }
}