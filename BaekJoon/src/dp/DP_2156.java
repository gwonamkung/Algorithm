package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DP_2156 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] price = new int[N + 1];
        int[][] dp = new int[N + 1][3];

        for (int i = 1; i <= N; i++) price[i] = Integer.parseInt(br.readLine());

        dp[1][1] = dp[1][2] = price[1];

        for (int i = 2; i <= N; i++) {
            dp[i][0] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]);
            dp[i][1] = dp[i - 1][0] + price[i];
            dp[i][2] = dp[i - 1][1] + price[i];
        }

        System.out.println(Math.max(Math.max(dp[N][0], dp[N][1]), dp[N][2]));
    }
}