package com.svshayt.leetcode.problemset.problem_724;

import java.util.Arrays;

public class Solution724 {

    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right) return 0;
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
