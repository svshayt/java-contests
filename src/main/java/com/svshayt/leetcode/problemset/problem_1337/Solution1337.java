package com.svshayt.leetcode.problemset.problem_1337;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            Pair pair = new Pair(Arrays.stream(mat[i]).sum(), i);
            priorityQueue.add(pair);
        }
        int[] result = new int[k];
        int index = 0;
        while (k>0) {
            result[index] = Objects.requireNonNull(priorityQueue.poll()).index();
            k--;
            index++;
        }
        return result;
    }
}

record Pair(int sum, int index) implements Comparable<Pair> {

    @Override
    public int compareTo(Pair o) {
        return Comparator.comparingInt(Pair::sum)
                .thenComparingInt(Pair::index)
                .compare(this, o);
    }
}