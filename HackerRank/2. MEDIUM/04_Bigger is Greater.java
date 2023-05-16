/**
 * 1. Problem Infomation
 *  - Title : Bigger is Greater
 *  - Link : https://www.hackerrank.com/challenges/bigger-is-greater/problem?isFullScreen=true
 *  2. Solved Core
 *  - find string combain rule
 *  3. Solved Review
 *  - you must know arrays sort area and find swap index init
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
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
        char[] wList = w.toCharArray();
        
        for (int idx = w.length() - 2;idx >= 0;idx--) {
            if (wList[idx] < wList[idx + 1]) {
                int nextIdx = getChar(wList, idx);
                swap(wList, idx, nextIdx);
                Arrays.sort(wList, idx + 1, w.length());
                
                StringBuffer sb = new StringBuffer();
                for (char ch : wList)
                    sb.append(ch);
                return sb.toString();
            }
        }
        
        return "no answer";
    }
    
    public static int getChar(char[] arr, int idx) {
        char min = arr[idx + 1];
        int index = idx + 1;
        
        for (int i = idx + 1;i < arr.length;i++) {
            if (arr[idx] < arr[i] && min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        
        return index;
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
