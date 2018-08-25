package dp.BOJ_11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int div = 10007;

        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) dp[i] = (i % 2 == 0) ? (2 * dp[i - 1] + 1) % div : (2 * dp[i - 1] - 1) % div;
        System.out.println(dp[n] % div);
    }
}
