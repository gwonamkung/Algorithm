package dp;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DP_9095 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(br.readLine());

        for (int t = 1; t <= tcase; t++) {
            int num = Integer.parseInt(br.readLine());

            int[] dp = new int[num + 1];
            if (num == 1) dp[1] = 1;
            if (num == 2) dp[2] = 2;
            if(num == 3) dp[3] = 4;
            if (num > 3) {
                dp[1] = 1;
                dp[2] = 2;
                dp[3] = 4;
                for (int i = 4; i <= num; i++) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            System.out.println(dp[num]);
        }
    }
}