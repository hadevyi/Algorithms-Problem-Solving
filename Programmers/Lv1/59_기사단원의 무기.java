/**
 * 1. 문제정보
 *  - 제목 : 기사단원의 무기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/136798
 *  2. 풀이핵심
 *  - 약수의 수를 구하는 방법이 핵심
 * 3. 풀이후기
 *  - 시간초과가 발생하며, 약수의 대칭성을 활용해 진행하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(5, 3, 2)); // 10
        System.out.println(solution(10, 3, 2)); // 21
    }

    public static int solution(int number, int limit, int power) {
        int[] knights = new int[number + 1];
        for (int i = 1;i <= number;i++) {
            int data = getData(i);
            knights[i] = data > limit ? power : data;
        }
        return getSumArray(knights);
    }

    public static int getData(int num) {
        if (num == 1) return 1;
        int count = 0;
        for (int i = 1;i * i <= num;i++)
            if (i * i == num)
                count++;
            else if (num % i == 0)
                count += 2;

        return count;
    }

    public static int getSumArray(int[] array) {
        int result = 0;
        for (int arr : array)
            result += arr;
        return result;
    }
}
