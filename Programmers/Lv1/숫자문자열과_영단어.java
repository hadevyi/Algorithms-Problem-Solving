class Solution {
    public int solution(String s) {
        String[] alpha = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        for (int i = 0; i < alpha.length; i++) {
            s = s.replaceAll(alpha[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}