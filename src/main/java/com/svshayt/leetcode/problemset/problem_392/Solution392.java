package com.svshayt.leetcode.problemset.problem_392;

public class Solution392 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int tIndex = 0;
        int sNum = 0;
        for (char c : s.toCharArray()) {
            while (tIndex < t.length()) {
                if (c == t.charAt(tIndex)) {
                    tIndex++;
                    sNum++;
                    break;
                }
                tIndex++;
            }

        }
        return sNum == s.length();
    }
}
