/**
 * 1. 문제정보
 *  - 제목 : 유한소수 판별하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120878
 *  2. 풀이핵심
 *  - 기약분수를 하기 위한 최대공약수를 진행하고, 해당의 약수들이 2과 5만으로 구상되어있는지 보았음
 * 3. 풀이후기
 *  - 약분을 할 수 있도록 최대공약수를 구하는 방법은 익숙해졌지만,
 *  - 약수의 리스트를 구하는 방법은 어려웠음.
 *  - 이 부분에 대해 다시 연습을 해야할 것으로 생각됨.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(7, 20)); // 1
        System.out.println(solution(11, 22)); // 1
        System.out.println(solution(12, 21)); // 2
    }

    public static int solution(int a, int b) {
        int GCD = getGCD(a, b);
        double mon = b/GCD;
        return getBase(getPrimeList(mon)) ? 1 : 2;
    }

    public static int N = 1000;

    public static boolean getBase(int[] numList) {
        for (int i = 2;i < N;i++)
            if (i != 2 && i != 5 && numList[i] > 0)
                return false;
        return true;
    }

    public static int[] getPrimeList(double num) {
        int[] list = new int[N];

        for (int i = 2;i <= num;i++) {
            while ((int) num % i == 0) {
                num /= i;
                list[i]++;
            }
        }

        return list;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 <= num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 == 0) return num1;
        return getGCD(num2, num1%num2);
    }
}
