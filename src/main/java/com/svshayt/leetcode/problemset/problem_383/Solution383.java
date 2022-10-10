package com.svshayt.leetcode.problemset.problem_383;

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        char end = 'z';
        for (char c : magazine.toCharArray()) {
            letters[end - c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            letters[end - c]--;
            if (letters[end - c] < 0) {
                return false;
            }
        }
        return true;
    }
}
