import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 여우는 어떻게 울지?
 *  - 번호 : 9536
 *  - 링크 : https://www.acmicpc.net/problem/9536
 *  2. 풀이핵심
 *  - 문자열 처리
 * 3. 풀이후기
 *  - 테스트 케이스마다의 동일 로직 반복하는 구성 확인
 *  - Collections의 함수를 활용해 removeAll 처리함
 *  - 필요한 분기를 나누어 진행함
 */
public class Main {
    static int T; // 테스트케이스 개수
    static ArrayList<String> recodeList;
    static ArrayList<String> removedList;

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++) {
            recodeList = new ArrayList<String>();
            removedList = new ArrayList<String>();

            while (true) {
                String str = br.readLine();

                if (str.equals("what does the fox say?")) break;
                else if (recodeList.size() == 0){
                    st = new StringTokenizer(str);
                    int Len = st.countTokens();

                    for (int len = 0; len < Len; len++)
                        recodeList.add(new String(st.nextToken()));
                } else {
                    String[] temp = str.split(" ");
                    removedList.add(temp[2]);
                }
            }

            recodeList.removeAll(removedList);
            for (int i = 0;i < recodeList.size();i++) {
                sb.append(recodeList.get(i));
                if (i < recodeList.size() - 1) sb.append(" ");
            }

            if (t < T - 1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}