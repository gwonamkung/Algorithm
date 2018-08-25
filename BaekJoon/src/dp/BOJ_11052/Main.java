package dp.BOJ_11052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n, bread[], dp[];

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());

        bread = new int[n + 1];
        dp = new int[n + 1];

        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 1; i <= n; i++) bread[i] = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            //핵심
            for (int j = 1; j <= i; j++) dp[i] = Math.max(dp[i], dp[i - j] + bread[j]);
        }
        System.out.println(dp[n]);
    }
}
