package com.svshayt.leetcode.problemset.problem_1337;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Solution1337Test {

    private final Solution1337 solution1337 = new Solution1337();

    private static Stream<Arguments> arguments() {
        int[][] input1 = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[] output1 = {2, 0, 3};
        int[][] input2 = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int[] output2 = {0, 2};
        return Stream.of(
                Arguments.of(input1, 3, output1),
                Arguments.of(input2, 2, output2)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void kWeakestRows(int[][] input1, int input2, int[] output) {
        assertThat(solution1337.kWeakestRows(input1, input2)).isEqualTo(output);
    }
}