package DP;

import java.util.*;

public class DP_1463 {
    public static int d[] = new int[100];

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            System.out.println(go(x));
        }
    }

    public static int go(int n) {
        //Top-down, 재귀 사용.
        /*if (n == 1) return 0;
        if (d[n] > 0) return d[n];
        d[n] = go(n - 1) + 1;
        if (n % 2 == 0) {
            int temp = go(n / 2) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        if (n % 3 == 0) {
            int temp = go(n / 3) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        return d[n];*/

        //Bottom-up, for문 사용.
        d[1] = 0;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i / 2] + 1;
            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
                d[i] = d[i / 2] + 1;
            }
            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
                d[i] = d[i / 3] + 1;
            }
        }
        return d[n];
    }
}
