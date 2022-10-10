package com.svshayt.leetcode.problemset.problem_383;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution383Test {

    private final Solution383 solution383 = new Solution383();

    private static Stream<Arguments> arguments() {
        String ransomNote11 = "a";
        String magazine12 = "b";
        boolean output1 = false;
        String ransomNote21 = "aa";
        String magazine22 = "ab";
        boolean output2 = false;
        String ransomNote31 = "aa";
        String magazine32 = "aab";
        boolean output3 = true;
        return Stream.of(
                Arguments.of(ransomNote11, magazine12, output1),
                Arguments.of(ransomNote21, magazine22, output2),
                Arguments.of(ransomNote31, magazine32, output3)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void canConstruct(String ransomNote, String magazine, boolean output) {
        assertThat(solution383.canConstruct(ransomNote, magazine)).isEqualTo(output);
    }
}