package com.svshayt.leetcode.problemset.problem_412;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.isEmpty()) {
                sb.append(i);
            }
            result.add(sb.toString());
        }
        return result;
    }
}
