import java.util.*;
import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 공백왕 빈-칸
 *  - 번호 : 3518
 *  - 링크 : https://www.acmicpc.net/problem/3518
 *  2. 풀이핵심
 *  - 문자열 관리
 * 3. 풀이후기
 *  - 가장 마지막에 공백이 있으면 안됨을 명시
 *  - 현재가 줄/단어 상 처음인지 마지막인지 확인하는 과정이 중요 
 */
public class Main {
    static ArrayList<ArrayList<String>> arrayList;
    static ArrayList<Integer> arrayMaxValue;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        String str;

        arrayList = new ArrayList<ArrayList<String>>();
        arrayMaxValue = new ArrayList<Integer>();

        while ((str = br.readLine()) != null) {
            ArrayList<String> temp = new ArrayList<String>();

            st = new StringTokenizer(str);
            int N = st.countTokens();

            for (int n = 0;n < N;n++) {
                String data = st.nextToken();
                temp.add(data);

                if (n >= arrayMaxValue.size()) arrayMaxValue.add(data.length());
                else arrayMaxValue.set(n, Math.max(arrayMaxValue.get(n), data.length()));
            }

            arrayList.add(temp);
        }

        int LEN = arrayList.size();
        for (int len = 0;len < LEN;len++) {
            ArrayList<String> list = arrayList.get(len);
            int N = list.size();

            for (int n = 0;n < N; n++){
                sb.append(list.get(n));
                if (n < N - 1) {
                    if (list.get(n).length() < arrayMaxValue.get(n))
                        for (int m = 0; m < arrayMaxValue.get(n) - list.get(n).length(); m++) sb.append(" ");
                    sb.append(" ");
                }
            }

            if (len < LEN - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}