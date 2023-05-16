/**
 * 1. Problem Infomation
 *  - Title : Short Palindrome
 *  - Link : https://www.hackerrank.com/challenges/short-palindrome/problem?isFullScreen=true
 *  2. Solved Core
 *  - short time complexity implements
 *  3. Solved Review
 *  - design count array (each)
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'shortPalindrome' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int N = 26;
    public static int MOD = (int)(Math.pow(10, 9)) + 7;
    public static int shortPalindrome(String s) {
        int answer = 0;
        int[] len1 = new int[N];        // count a
        int[][] len2 = new int[N][N];   // count (a, b)
        int[] len3 = new int[N];        // count (a, b, b)
        
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            
            answer = (answer + len3[idx]) % MOD;
            
            for (int n = 0;n < N;n++) len3[n] = (len3[n] + len2[n][idx]) % MOD;
            for (int n = 0;n < N;n++) len2[n][idx] = (len2[n][idx] + len1[n]) % MOD;
            len1[idx] = (len1[idx] + 1) % MOD;
        }
        
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.shortPalindrome(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
