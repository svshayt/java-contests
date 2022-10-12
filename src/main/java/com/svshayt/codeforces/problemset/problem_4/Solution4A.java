package com.svshayt.codeforces.problemset.problem_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution4A {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private final PrintWriter pw = new PrintWriter(new BufferedWriter(new PrintWriter(System.out)));

    public static void main(String[] args) throws IOException {
        new Solution4A().solve();
    }

    public void solve() throws IOException {
        int w = Integer.parseInt(br.readLine());
        if (w < 4) {
            pw.println("NO");
        } else if (w % 2 == 0) {
            pw.println("YES");
        } else pw.println("NO");
        pw.close();
    }
}
