import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 테이블 해시 함수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147354
 *  2. 풀이핵심
 *  - Array sort, XOR 구현
 * 3. 풀이후기
 *  - 정렬에는 어렵지 않지만, XOR 구현에 시간이 걸렸다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{2,2,6},{1,5,10},{4,2,9},{3,8,3}}, 2, 2, 3)); // 4
    }

    public static int[] si;
    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        si = new int[row_end - row_begin + 1];
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[col - 1] == o2[col - 1])
                    return o2[0] - o1[0];
                return o1[col - 1] - o2[col - 1];
            }
        });

        int idx = 0;
        for (int r = row_begin - 1;r < row_end;r++) {
            int temp = 0;
            for (int d : data[r])
                temp += d % (r + 1);
            si[idx++] = temp;
        }

        if (si.length == 1) return si[0];
        return xorArray();
    }

    public static int xorArray() {
        int result = xor(si[0], si[1]);
        if (si.length == 2) return result;
        for (int i = 2;i < si.length;i++)
            result = xor(result, si[i]);
        return result;
    }

    public static int xor(int value1, int value2) {
        String str1 = Integer.toBinaryString(value1);
        String str2 = Integer.toBinaryString(value2);
        int LEN = Math.max(str1.length(), str2.length());

        StringBuffer sb = new StringBuffer();
        if (str1.length() < LEN) {
            for (int i = 0;i < LEN - str1.length();i++)
                sb.append(0);
            sb.append(str1);
            str1 = sb.toString();
        }

        if (str2.length() < LEN) {
            for (int i = 0;i < LEN - str2.length();i++)
                sb.append(0);
            sb.append(str2);
            str2 = sb.toString();
        }

        sb = new StringBuffer();
        for (int n = 0;n < LEN;n++) {
            char ch1 = str1.charAt(n);
            char ch2 = str2.charAt(n);

            if (ch1 == ch2)
                sb.append(0);
            else
                sb.append(1);
        }

        return getNum(sb.toString());
    }

    public static int getNum(String str) {
        int result = 0;

        for (int i = 0, sub = str.length() - 1;i < str.length() && sub >= 0;i++, sub--)
            result += (str.charAt(i) - '0') * (int) Math.pow(2, sub);

        return result;
    }
}
