import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 후위 표기식2
 *  - 번호 : 1935
 *  - 링크 : https://www.acmicpc.net/problem/1935
 *  2. 풀이핵심
 *  - 후위연산자 방식을 이해하고, 순차대로 풀이하기
 * 3. 풀이후기
 *  - 피연산자로 입력되는 A~Z가 100이하의 수로 다양한 길이가 들어오는 것을 늦게 확인
 *  - 결과는 실수값으로 소수점이하 2번째까지 출력하는 format까지 생소했음
 */
public class Main {
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int Len = str.length();
        double[] doubleList = new double[N];

        for (int n = 0;n < N;n++)
            doubleList[n] = Integer.parseInt(br.readLine());

        Stack<Double> stack = new Stack<>();
        for (int len = 0;len < Len;len++) {
            char tempStr = str.charAt(len);
            if ('A' <= tempStr && tempStr <= 'Z') stack.push(doubleList[tempStr-'A']);
            else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                switch (tempStr) {
                    case '+' : stack.push(num2 + num1); break;
                    case '-' : stack.push(num2 - num1); break;
                    case '*' : stack.push(num2 * num1); break;
                    case '/' : stack.push(num2 / num1); break;
                }
            }
        }

        System.out.println(String.format("%.2f", stack.pop()));
    }
}