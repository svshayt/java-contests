package com.svshayt.leetcode.problemset.problem_234;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Solution234Test {

    private final Solution234 solution234 = new Solution234();

    private static Stream<Arguments> arguments() {
        boolean output1 = true;
        ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        boolean output2 = false;
        ListNode input2 = new ListNode(1, new ListNode(2));

        boolean output3 = true;
        ListNode input3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))))));


        return Stream.of(
                Arguments.of(input1, output1),
                Arguments.of(input2, output2),
                Arguments.of(input3, output3)
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void isPalindrome(ListNode head, boolean output) {
        assertThat(solution234.isPalindrome(head)).isEqualTo(output);
    }
}