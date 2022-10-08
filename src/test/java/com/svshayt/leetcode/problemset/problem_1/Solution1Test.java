package com.svshayt.leetcode.problemset.problem_1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1Test {

    private final Solution1 solution1 = new Solution1();

    @Test
    void maximumWealth_testCase_1() {
        int [][] input = {{1,2,3}, {3,2,1}};
        int output = 6;
        assertThat(solution1.maximumWealth(input)).isEqualTo(output);
    }

    @Test
    void maximumWealth_testCase_2() {
        int [][] input = {{1,5}, {7,3}, {3,5}};
        int output = 10;
        assertThat(solution1.maximumWealth(input)).isEqualTo(output);
    }

    @Test
    void maximumWealth_testCase_3() {
        int [][] input = {{2,8,7}, {7,1,3}, {1,9,5}};
        int output = 17;
        assertThat(solution1.maximumWealth(input)).isEqualTo(output);
    }
}