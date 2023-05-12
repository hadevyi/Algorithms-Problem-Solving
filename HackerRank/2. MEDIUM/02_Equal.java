/**
 * 1. Problem Infomation
 *  - Title : Equal
 *  - Link : https://www.hackerrank.com/challenges/equal/problem?isFullScreen=true
 *  2. Solved Core
 *  - dynamic programming and target numbers
 *  3. Solved Review
 *  - VERY VERY HARD SOLVED
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
     * Complete the 'equal' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int[] chocolate = {1, 2, 5};
    public static int equal(List<Integer> arr) {
        int min = Collections.min(arr);
        
        int[] dp = new int[1002]; // 1 <= arr[i] < 1000 and check + 2
        dp[1] = dp[2] = dp[5] = 1;
        dp[3] = dp[4] = 2;
        
        for (int i = 6;i < dp.length;i++) {
            dp[i] = Math.min(Math.min(dp[i - 1], dp[i - 2]), dp[i - 5]) + 1;
        }
        
        int answer = Integer.MAX_VALUE;
        for (int i = 0;i < 3;i++) {
            int temp = 0;
            for (int data : arr) 
                temp += dp[data - min + i];
            answer = Math.min(answer, temp);
        }
        return answer;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.equal(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
