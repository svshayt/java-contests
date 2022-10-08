package com.svshayt.leetcode.problemset.problem_1;

public class Solution1 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
