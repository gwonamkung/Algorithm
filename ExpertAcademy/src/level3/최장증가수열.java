package level3;

import java.util.Scanner;

public class 최장증가수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();

        for (int tcase = 1; tcase <= t; tcase++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long m = 0;
            int l = 0;
            arr[0] = sc.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextLong();
                if (Math.abs(arr[i] - arr[i - 1]) > m) {
                    m = arr[i] - arr[i - 1];
                    l = i;
                }
            }
            System.out.println("#" + tcase + " " + l);
        }
    }
}
