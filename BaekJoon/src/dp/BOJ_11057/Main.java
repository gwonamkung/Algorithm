package dp.BOJ_11057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] dp = new int[10];
        Arrays.fill(dp, 1);

        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            dp[1] = 1;
            for (int j = 2; j <= 9; j++) {
                dp[j] += dp[j - 1] % 10007;
            }
            cnt += dp[9] % 10007;
        }
        System.out.println(cnt % 10007);
    }
}
