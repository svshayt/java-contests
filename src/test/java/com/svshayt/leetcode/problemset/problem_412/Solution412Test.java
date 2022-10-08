package com.svshayt.leetcode.problemset.problem_412;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution412Test {

    private final Solution412 solution412 = new Solution412();

    private static Stream<Arguments> arguments() {
        int input1 = 3;
        List<String> output1 = List.of("1", "2", "Fizz");
        int input2 = 5;
        List<String> output2 = List.of("1", "2", "Fizz", "4", "Buzz");
        int input3 = 15;
        List<String> output3 = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        return Stream.of(
                Arguments.of(input1, output1),
                Arguments.of(input2, output2),
                Arguments.of(input3, output3)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void fizzBuzz(int input, List<String> output) {
        assertThat(solution412.fizzBuzz(input)).isEqualTo(output);
    }
}