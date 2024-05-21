import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어 정렬
 *  - 번호 : 1181
 *  - 링크 : https://www.acmicpc.net/problem/1181
 *  2. 풀이핵심
 *  - 사용자 정의 class 정렬 기준 세우기
 * 3. 풀이후기
 *  - 중복시 표시하지 않는다를 구현하는 방법에 대해 고민하였음
 */
public class Main {

    static int N;
    static Str[] strList;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        strList = new Str[N];
        int idx = 0;

        for (int n = 0;n < N;n++)
            strList[n] = new Str(br.readLine());

        Arrays.sort(strList);

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            if (n == 0 || !strList[n].data.equals(strList[n-1].data))
                sb.append(strList[n].data).append("\n");
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    public static class Str implements Comparable<Str> {

        public String data;

        public Str(String data) {
            this.data = data;
        }

        @Override
        public int compareTo(Str o) {
            if (this.data.length() == o.data.length())
                return this.data.compareTo(o.data);
            return this.data.length() - o.data.length();
        }
    }
}
