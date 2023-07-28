import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5122. [파이썬 S/W 문제해결 기본] 7일차 - 수열 편집
 *  2. 풀이핵심
 *  - linkedlist의 활용
 * 3. 풀이후기
 *  - stl의 linkedlist의 업데이트는 set이다.
 */
public class Solution {

    public static int T;
    public static LinkedList<Integer> linkedList;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            linkedList = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 수열의 길이
            int M = Integer.parseInt(st.nextToken()); // 추가 횟수
            int L = Integer.parseInt(st.nextToken()); // 출력할 인덱스 번호

            st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                linkedList.addLast(Integer.parseInt(st.nextToken()));

            for (int m = 0;m < M;m++) {
                st = new StringTokenizer(br.readLine());

                String command = st.nextToken();
                if (command.equals("I")) { // 삽입
                    int index = Integer.parseInt(st.nextToken());
                    int data = Integer.parseInt(st.nextToken());
                    linkedList.add(index, data);
                } else if (command.equals("D")) { // 삭제
                    int index = Integer.parseInt(st.nextToken());
                    linkedList.remove(index);
                } else { // 바꾸기
                    int index = Integer.parseInt(st.nextToken());
                    int data = Integer.parseInt(st.nextToken());
                    linkedList.set(index, data);
                }
            }

            sb.append(L >= linkedList.size() ? -1 : linkedList.get(L));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
