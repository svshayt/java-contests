package com.svshayt.leetcode.problemset.problem_876;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Solution876Test {

    private final Solution876 solution876 = new Solution876();

    private static Stream<Arguments> arguments() {
        ListNode output1 = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode input1 = new ListNode(1, new ListNode(2, output1));

        ListNode output2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode input2 = new ListNode(1, new ListNode(2, new ListNode(3, output2)));

        ListNode output3 = new ListNode(1);


        return Stream.of(
                Arguments.of(input1, output1),
                Arguments.of(input2, output2),
                Arguments.of(output3, output3)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void middleNode(ListNode input, ListNode output) {
        assertThat(solution876.middleNode(input)).isEqualTo(output);
    }
}