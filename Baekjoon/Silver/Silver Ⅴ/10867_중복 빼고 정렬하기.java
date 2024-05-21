import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 중복 빼고 정렬하기
 *  - 번호 : 10867
 *  - 링크 : https://www.acmicpc.net/problem/10867
 *  2. 풀이핵심
 *  - 중복을 확인하고 데이터를 추가함
 * 3. 풀이후기
 *  - Array로 중복을 확인해 넣거나, Array를 Set으로 변환할 수 있지만 ArrayList로 간단하게 구현함
 */
public class Main {

    static int N;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());
            if (!arrayList.contains(num))
                arrayList.add(num);
        }

        Collections.sort(arrayList);
        StringBuffer sb = new StringBuffer();
        for (int num : arrayList)
            sb.append(num).append(" ");
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
