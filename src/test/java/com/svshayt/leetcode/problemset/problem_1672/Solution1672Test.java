package com.svshayt.leetcode.problemset.problem_1672;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1672Test {

    private final Solution1672 solution1672 = new Solution1672();

    private static Stream<Arguments> arguments() {
        int[][] input1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] input2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] input3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        return Stream.of(
                Arguments.of(input1, 6),
                Arguments.of(input2, 10),
                Arguments.of(input3, 17)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void maximumWealth(int[][] input, int output) {
        assertThat(solution1672.maximumWealth(input)).isEqualTo(output);
    }
}