import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1230. [S/W 문제해결 기본] 8일차 - 암호문3
 *  2. 풀이핵심
 *  - linkded list를 활용하기
 * 3. 풀이후기
 *  - stl로 풀이하니 너무나도 간편한 문제였다. 직접 구현한다고 생각하면 아찔한 문제...
 */
public class Solution {

    public static int T = 10;
    public static LinkedList<Integer> linkedList;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/dx2023task/linkedlist/input01.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine()); // 원본 암호의 개수
            linkedList = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int n = 0;n < N;n++) // 원본 암호 뭉치
                linkedList.addLast(Integer.parseInt(st.nextToken()));

            N = Integer.parseInt(br.readLine()); // 명령어의 개수
            st = new StringTokenizer(br.readLine());

            while (st.countTokens() > 0) {
                String command = st.nextToken();

                if (command.equals("I")) { // 삽입
                    int index = Integer.parseInt(st.nextToken());
                    int LEN = Integer.parseInt(st.nextToken());
                    List<Integer> list = new ArrayList<>();
                    for (int len = 0; len < LEN; len++)
                        list.add(Integer.parseInt(st.nextToken()));
                    insert(index, list);
                } else if (command.equals("D")) { // 삭제
                    int index = Integer.parseInt(st.nextToken());
                    int count = Integer.parseInt(st.nextToken());
                    delete(index, count);
                } else { // 추가
                    int LEN = Integer.parseInt(st.nextToken());
                    List<Integer> list = new ArrayList<>();
                    for (int len = 0;len < LEN;len++)
                        list.add(Integer.parseInt(st.nextToken()));
                    addLast(list);
                }
            }

            for (int i = 0;i < 10;i++) {
                sb.append(linkedList.get(i));
                if (i < 9) sb.append(" ");
            }
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void insert(int index, List<Integer> list) {
        linkedList.addAll(index, list);
    }

    public static void delete(int index, int count) {
        for (int c = 0;c < count;c++) {
            linkedList.remove(index);
        }
    }

    public static void addLast(List<Integer> list) {
        linkedList.addAll(list);
    }
}
