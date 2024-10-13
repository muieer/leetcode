package io.github.muieer.java.algorithms.dynamicplanning;

public class LeetCode005 {

    public static void main(String[] args) {
        System.out.println(new LeetCode005().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        return violenceSolution(s);
    }

    private String dpSolution(String s) {
        return "";
    }

    private String violenceSolution(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1+i; j <= s.length(); j++) {
                String str = s.substring(i,j);
                if (isPalindrome(str)) {
                    res = str.length() >= res.length() ? str : res;
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
