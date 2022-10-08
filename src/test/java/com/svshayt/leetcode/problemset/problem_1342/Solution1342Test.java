package com.svshayt.leetcode.problemset.problem_1342;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1342Test {

    private final Solution1342 solution1342 = new Solution1342();

    @ParameterizedTest
    @CsvSource(value = {"14:6", "8:4", "123:12"}, delimiter = ':')
    void numberOfSteps(int input, int output) {
        assertThat(solution1342.numberOfSteps(input)).isEqualTo(output);
    }
}