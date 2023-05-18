/**
 * 1. Problem Infomation
 *  - Title : Solve Me First
 *  - Link : https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true
 *  2. Solved Core
 *  - math
 *  3. Solved Review
 *  - simple problem
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
      	return a + b;
   }

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
