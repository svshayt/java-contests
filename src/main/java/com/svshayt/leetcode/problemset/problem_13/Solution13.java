package com.svshayt.leetcode.problemset.problem_13;

//  Symbol    Value
//    I         1
//    V         5
//    X         10
//    L         50
//    C         100
//    D         500
//    M         1000
public class Solution13 {

    public int romanToInt(String s) {

        int result = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int current = getRomanCharToInt(chars[i]);
            int next = (i + 1) < chars.length ? getRomanCharToInt(chars[i + 1]) : 0;
            if (current >= next) {
                result += current;
            } else {
                result -= current;
            }
        }
        return result;
    }

    public int getRomanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
