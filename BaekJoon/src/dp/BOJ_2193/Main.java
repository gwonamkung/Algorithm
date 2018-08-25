package dp.BOJ_2193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());

        long[] dp = new long[V + 1];

        if (V == 1) dp[1] = 1;
        else if (V == 2) dp[2] = 1;
        else {
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i <= V; i++) dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[V]);
    }
}