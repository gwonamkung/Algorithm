package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DP_10844_unsolved {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());

        long[] memo = new long[n + 1];
        memo[1] = 9;
        memo[2] = 17;
        memo[3] = 32;
        if (n >= 2) {
            for (int i = 4; i <= n; i++) {
                memo[i] = memo[i - 3] * 7 - 3;
            }
            System.out.println(memo[n] % 1000000000);
        } else System.out.println(memo[1]);
    }
}
