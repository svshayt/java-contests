package com.svshayt.leetcode.problemset.problem_13;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Solution13Test {

    private final Solution13 solution13 = new Solution13();

    private static Stream<Arguments> arguments() {
        String input1 = "III";
        int output1 = 3;

        String input2 = "LVIII";
        int output2 = 58;

        String input3 = "MCMXCIV";
        int output3 = 1994;

        return Stream.of(
                Arguments.of(input1, output1),
                Arguments.of(input2, output2),
                Arguments.of(input3, output3)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void romanToInt(String input, int output) {
        assertThat(solution13.romanToInt(input)).isEqualTo(output);
    }
}