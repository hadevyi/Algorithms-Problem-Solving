/**
 * 1. Problem Infomation
 *  - Title : The Grid Search
 *  - Link : https://www.hackerrank.com/challenges/the-grid-search/problem?isFullScreen=true
 *  2. Solved Core
 *  - find start i, j
 *  3. Solved Review
 *  - detail indexOf method
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
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */
    public static String gridSearch(List<String> G, List<String> P) {
        List<Point> checkList = new ArrayList<>();
        int width = P.get(0).length();
        
        for (int c = 0;c < G.size() - P.size() + 1;c++) {
            int idx = 0;
            String line = G.get(c);
            while (line.indexOf(P.get(0), idx) != -1 && idx + width <= line.length()) {
                int i = line.indexOf(P.get(0), idx);
                checkList.add(new Point(i, c));
                idx++;
            }
        }
        
        if (checkList.isEmpty()) return "NO";
        
        for (int size = 0;size < checkList.size();size++) {
            Point point = checkList.get(size);
            boolean isSame = true;
            int idx = 0;
            
            for (int c = point.j;c < point.j + P.size();c++) {
                if (!G.get(c).substring(point.i, point.i + width).equals(P.get(idx))) {
                    isSame = false;
                    break;
                }
                idx++;
            }
            
            if (isSame) return "YES";
        }
        
        return "NO";
    }


    public static class Point {
        int i, j;
        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
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

                int R = Integer.parseInt(firstMultipleInput[0]);

                int C = Integer.parseInt(firstMultipleInput[1]);

                List<String> G = IntStream.range(0, R).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int r = Integer.parseInt(secondMultipleInput[0]);

                int c = Integer.parseInt(secondMultipleInput[1]);

                List<String> P = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridSearch(G, P);

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
