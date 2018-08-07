package level3;

import java.util.*;

public class 최장증가수열 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int n = sc.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println("#" + tcase + " " + LIS_DP(arr));
        }
    }

    static int LIS_DP(int[] nums) {
        if (arr.length == 0) return 0;
        int[] dp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    System.out.println("dp["+i+"]: " + dp[i] + " j: " + j);
                }
            }
        }
        int max = 0;
        for (int items : dp) max = Math.max(items, max);
        return max;
    }
}