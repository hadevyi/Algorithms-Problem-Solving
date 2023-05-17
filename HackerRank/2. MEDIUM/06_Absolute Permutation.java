/**
 * 1. Problem Infomation
 *  - Title : Absolute Permutation
 *  - Link : https://www.hackerrank.com/challenges/absolute-permutation/problem?isFullScreen=true
 *  2. Solved Core
 *  - choose minus num or plus num
 *  3. Solved Review
 *  - num range check and what choose
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
     * Complete the 'absolutePermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */

    public static List<Integer> absolutePermutation(int n, int k) {
        if (k == 0) return getBasicResult(n); // 1~n list if k is 0
        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>(); // set contains more fast than list contains
        
        for (int i = 1;i <= n;i++) {
            int toMinus = i + k;
            int toPlus = i - k;
            
            if (toMinus > n && toPlus <= 0) return getFailResult();
            if (set.contains(toMinus) && set.contains(toPlus)) return getFailResult();
            
            if (toPlus <= 0 && toMinus <= n && !set.contains(toMinus)) {
                answer.add(toMinus);
                set.add(toMinus);
            } else if (toPlus > 0 && !set.contains(toPlus)) {
                answer.add(toPlus);
                set.add(toPlus);
            } else if (toMinus <= n && set.contains(toPlus) && !set.contains(toMinus)) {
                answer.add(toMinus);
                set.add(toMinus);
            } else if (toMinus > n && toPlus > 0 && !set.contains(toPlus)) {
                answer.add(toPlus);
                set.add(toPlus);
            } else return getFailResult();
        }
        
        return answer;
    }
    
    public static List<Integer> getBasicResult(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= n;i++)
            list.add(i);
        return list;
    }
    
    public static List<Integer> getFailResult() {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> result = Result.absolutePermutation(n, k);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

