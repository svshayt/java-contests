package com.svshayt.codeforces.problemset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CodeforcesSolutionTemplate {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int t = fs.nextInt();
        while (t-- > 0) {
            //todo
        }
        pw.close();
    }

    ////////////////////////////////// SUPPORT /////////////////////////////////
    static class FastScanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}