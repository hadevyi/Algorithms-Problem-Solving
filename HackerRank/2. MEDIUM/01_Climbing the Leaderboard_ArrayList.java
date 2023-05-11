/**
 * 1. Problem Infomation
 *  - Title : Climbing the Leaderboard
 *  - Link : https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem?isFullScreen=true
 *  2. Solved Core
 *  - ranked list is descending, player list is ascending.
 *  3. Solved Review
 *  - remove duplication and arraylist
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
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> answer = new ArrayList<>();
        ArrayList<Person> ranking = new ArrayList<>();
        
        for (int rank : ranked)
            ranking.add(new Person(rank));
        
        Collections.sort(ranking);
        
        ranking.get(0).setRank(1);
        for (int i = 1;i < ranking.size();i++) {
            Person before = ranking.get(i - 1);
            Person now = ranking.get(i);
            
            if (before.getScore() == now.getScore())
                now.setRank(before.getRank());
            else
                now.setRank(before.getRank() + 1);
        }
        
        int start = ranking.size() - 1;
        for (int play : player) {
            int[] result = findRank(ranking, start, play); // 0 start, 1 rank
            start = result[0];
            answer.add(result[1]);
        }
        
        return answer;
    }
    
    public static int[] findRank(ArrayList<Person> ranking, int start, int score) {
        for (int n = start;n >= 0;n--) {
            if (ranking.get(n).score < score) continue;
            
            if (ranking.get(n).getScore() > score)
                return new int[] {n, ranking.get(n).rank + 1};
            else
                return new int[] {n, ranking.get(n).rank};
        }
        return new int[] {0, 1};
    }
    
    public static class Person implements Comparable<Person> {
        int rank, score;
        public Person(int score) {
            this.score = score;
        }
        public void setRank(int rank) {
            this.rank = rank;
        }
        public int getRank() {
            return this.rank;
        }
        public int getScore() {
            return this.score;
        }
        @Override
        public int compareTo(Person o) {
            return o.score - this.score;
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
