import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42839
 *  2. 풀이핵심
 *  - 순열 구하기
 * 3. 풀이후기
 *  - 부분집합의 순열을 구해서 중복없이 저장해서 진행하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("17")); // 3
        System.out.println(solution("011")); // 2
    }

    public static int N, MAX;
    public static int[] array;
    public static String[] number;
    public static boolean[] isVisited;
    public static ArrayList<Integer> arrayList;
    public static int solution(String numbers) {
        arrayList = new ArrayList<>();
        N = numbers.length();
        number = new String[N];

        for (int n = 0;n < N;n++)
            number[n] = Character.toString(numbers.charAt(n));

        for (int max = 1;max <= N;max++) {
            MAX = max;
            array = new int[MAX];
            isVisited = new boolean[N];
            prime(0);
        }

        return arrayList.size();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2;i <= (int)(Math.sqrt(number));i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void prime(int tgtIdx) {
        if (tgtIdx == MAX) {
            StringBuffer sb = new StringBuffer();
            for (int a : array)
                sb.append(number[a]);
            int result = Integer.parseInt(sb.toString());
            if (!arrayList.contains(result) && isPrime(result))
                arrayList.add(result);
            return;
        }

        for (int i = 0;i < N;i++) {
            if(isVisited[i]) continue;
            isVisited[i] = true;
            array[tgtIdx] = i;
            prime(tgtIdx + 1);
            isVisited[i] = false;
        }
    }
}
