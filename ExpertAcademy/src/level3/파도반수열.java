package level3;

import java.util.Scanner;

public class 파도반수열 {
    static long[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int index = scanner.nextInt();
            System.out.println("#" + tcase + " " + dp(index));
        }
    }

    public static Long dp(int j) {
        arr = new long[101];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 2;
        if (arr[j - 1] != 0) {
            return arr[j - 1];
        } else {
            for (int i = 5; i < j; i++) {
                arr[i] = arr[i - 1] + arr[i - 5];
            }
            return arr[j - 1];

        }
    }
}
